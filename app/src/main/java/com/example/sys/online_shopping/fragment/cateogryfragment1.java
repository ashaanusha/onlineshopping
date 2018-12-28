package com.example.sys.online_shopping.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.sys.online_shopping.R;
import com.example.sys.online_shopping.Recycleradapter.Recycleradapter_product;

public class cateogryfragment1 extends Fragment {
    RecyclerView recyclerView;
    int[] images = {R.drawable.pf2, R.drawable.perfume2, R.drawable.femalepf1};
String[] button={"For men","For women","For kids"};
    ArrayAdapter <String> adapter;
    Recycleradapter_product recycler;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.product_categories, container, false );
        RecyclerView recyclerView1 = view.findViewById( R.id.recycler2 );
        recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
        Recycleradapter_product recyclerAdapter = new Recycleradapter_product( getActivity(), images,button);
        recyclerView1.setAdapter( recyclerAdapter );

getActivity().setTitle( "Product Categories" );

 return view;
}}

