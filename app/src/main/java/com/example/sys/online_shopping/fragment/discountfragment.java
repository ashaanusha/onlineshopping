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
import com.example.sys.online_shopping.Recycleradapter.RecyclerAdapter_discountsales;
import com.example.sys.online_shopping.Recycleradapter.Recycleradapter_product;

public class discountfragment extends Fragment {

    RecyclerView recyclerView;
        int[] images = {R.drawable.pf7, R.drawable.pf5, R.drawable.pf2};
        String[] arr={"$70","$80","60"};
        String[] arr1={"$50","$30","$25"};
        String[] arr2={"Versace Man","Revlon women","Mancave"};
        String[] arr3={"50 remaining","30 remaining","$60 remaining"};
        String[] arr4={"$20 discount on product","$10 discount on product","$15 discount on product"};
        int[] images1={R.drawable.ic_watch_later_black_24dp,R.drawable.ic_watch_later_black_24dp,R.drawable.ic_watch_later_black_24dp};
        String[] arr5={"Explore","Explore","Explore"};
        ArrayAdapter<String> adapter;
        Recycleradapter_product recycler;

        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate( R.layout.discount_sales, container, false );
            RecyclerView recyclerView1 = view.findViewById( R.id.recycler4);
            recyclerView1.setLayoutManager( new LinearLayoutManager( getActivity() ) );
            RecyclerAdapter_discountsales recyclerAdapter = new RecyclerAdapter_discountsales( getActivity(), images,arr,arr1,arr2,arr3,arr4,arr5,images1 );
            recyclerView1.setAdapter( recyclerAdapter );

            getActivity().setTitle( "Discount Sales" );

            return view;
    }

}
