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
import com.example.sys.online_shopping.Recycleradapter.Recycleradapter_product;
import com.example.sys.online_shopping.Recycleradapter.Recycleradapter_seller;

public class bestsellerfragment extends Fragment {

    RecyclerView recyclerView;
    int[] images = {R.drawable.casualpf, R.drawable.pf5, R.drawable.femalepf1,R.drawable.perfume2,R.drawable.pf4,R.drawable.pf7};
    String[] arr1={"White Linen","One Electric CK","Versace Man","Fine Cologne","Escada","Black Opium"};
    String[] arr2={"$60","$80","$45","$50","$80","$100"};

    ArrayAdapter<String> adapter;
    Recycleradapter_product recycler;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.best_sellers, container, false );
        RecyclerView recyclerView1 = view.findViewById( R.id.recycler3 );
        recyclerView1.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );
        Recycleradapter_seller recyclerAdapter = new Recycleradapter_seller( getActivity(), images,arr1,arr2 );
        recyclerView1.setAdapter( recyclerAdapter );

        getActivity().setTitle( "Best Sellers" );

        return view;
    }

}