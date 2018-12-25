package com.example.sys.online_shopping;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Timer;
import java.util.TimerTask;

public class exploreFragment extends Fragment {
    private ViewPager introPager;
    private LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    RecyclerView recyclerView;
    int[] images = {R.drawable.pf2, R.drawable.perfume2, R.drawable.femalepf1, R.drawable.casualpf, R.drawable.perfume};
    ArrayAdapter<String> adapter;
    RecyclerAdapter6activity recycler;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main5, container, false);
        introPager = view.findViewById(R.id.home_banner_pager);
        sliderDotspanel = view.findViewById(R.id.home_banner_pager_indicator);
        ViewPagerAdapter6 viewPagerAdapter = new ViewPagerAdapter6(getActivity());
        RecyclerView recyclerView1 = view.findViewById(R.id.recycler1);
        recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        RecyclerAdapter6activity recyclerAdapter = new RecyclerAdapter6activity(getActivity(), images);
        recyclerView1.setAdapter(recyclerAdapter);
        introPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];


        setUpSlider();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 3000, 4000);


        getActivity().setTitle("Exotic Perfumes");
        return view;
    }

    private void setUpSlider() {


        for (int i = 0; i < dotscount; i++) {

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.nonactive_dot));

        introPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for (int i = 0; i < dotscount; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity(), R.drawable.nonactive_dot));
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            if (getActivity() == null)
                return;
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if (introPager.getCurrentItem() == 0) {
                        introPager.setCurrentItem(1);
                    } else if (introPager.getCurrentItem() == 1) {
                        introPager.setCurrentItem(2);
                    } else if (introPager.getCurrentItem() == 2) {
                        introPager.setCurrentItem(3);
                    } else {
                        introPager.setCurrentItem(0);
                    }

                }
            });
        }

    }
}
