package com.example.sys.online_shopping;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.TimerTask;

public class Fragment1 extends Fragment {
    private ViewPager introPager;
    private LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    RecyclerView recyclerView;
    int [] images =  {R.drawable.pf2,R.drawable.perfume2,R.drawable.femalepf1,R.drawable.casualpf,R.drawable.perfume};
    ArrayAdapter<String> adapter;
    RecyclerAdapter recycler;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main5, container, false);
        introPager =view.findViewById( R.id.home_banner_pager );
        sliderDotspanel =view.findViewById( R.id.home_banner_pager_indicator );
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter( getActivity() );
RecyclerView recyclerView1=view.findViewById( R.id.recycler1 );
recyclerView1.setLayoutManager( new GridLayoutManager( getActivity(),2 ) );
RecyclerAdapter recyclerAdapter=new RecyclerAdapter(getActivity(),images);
recyclerView1.setAdapter( recyclerAdapter );
        introPager.setAdapter( viewPagerAdapter );

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        class MyTimerTask extends TimerTask {

            @Override
            public void run() {

            if (getActivity()    == null)
                return;
            getActivity().runOnUiThread( new Runnable() {
                    @Override
                    public void run() {

                        if (introPager.getCurrentItem() == 0) {
                            introPager.setCurrentItem( 1 );
                        } else if (introPager.getCurrentItem() == 1) {
                            introPager.setCurrentItem( 2 );
                        } else if (introPager.getCurrentItem() == 2) {
                            introPager.setCurrentItem( 3 );
                        } else {
                            introPager.setCurrentItem( 0 );
                        }

                    }
                } );
            }

        }

        return view;
    }
}
