package com.example.sys.online_shopping.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.sys.online_shopping.R;
import com.example.sys.online_shopping.Recycleradapter.RecyclerAdapter_order;

public class Orderfragment extends Fragment {

    private RecyclerView recyclerView;
    String[] arr={"In process","completed","In process","In process"};
    String[] arr1={"Order Number 12","Order Number 13","Order Number 14","Order Number 15"};
    String[] arr2={"2017-4-4","2017-4-3","2017-4-4","2017-4-4"};
    private  Integer[] Images={R.drawable.order,R.drawable.order,R.drawable.order,R.drawable.order};
    private ArrayAdapter<String> adapter;
    private RecyclerAdapter_order recycler;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.order, container, false );
        RecyclerView recyclerView1 = view.findViewById( R.id.recycle1);
        recyclerView1.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );
        RecyclerAdapter_order recyclerAdapter = new RecyclerAdapter_order( getActivity(),arr,Images,arr1,arr2);
        recyclerView1.setAdapter( recyclerAdapter );

        getActivity().setTitle( "Order history" );

        return view;
    }

}
