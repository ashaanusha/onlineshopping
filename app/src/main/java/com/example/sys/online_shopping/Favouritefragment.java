package com.example.sys.online_shopping;

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

public class Favouritefragment extends Fragment {
    private RecyclerView recyclerView;
    String[] title={"DG the one","White lane","Versace man","Fine cologne"};
    String[] dollar={"$ 12","$ 13","$ 14","$ 50"};
    private  Integer[] Images={R.drawable.pf2,R.drawable.db_perfume,R.drawable.pf4,R.drawable.perfume2};
    private  Integer[] Images1={R.drawable.ic_close_black_24dp,R.drawable.ic_close_black_24dp,R.drawable.ic_close_black_24dp,R.drawable.ic_close_black_24dp};



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.favourite, container, false );
        RecyclerView recyclerView1 = view.findViewById( R.id.recycle2);
        recyclerView1.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );
        RecyclerAdapter_favourite recyclerAdapter = new RecyclerAdapter_favourite( getActivity(),title,Images,dollar,Images1);
        recyclerView1.setAdapter( recyclerAdapter );

        getActivity().setTitle( "Favorite" );

        return view;
    }





}
