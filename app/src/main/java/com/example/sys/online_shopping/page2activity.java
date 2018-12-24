package com.example.sys.online_shopping;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.TimerTask;

public class page2activity extends AppCompatActivity {
    private ViewPager introPager;
    private LinearLayout sliderDotspanel;

    private int dotscount;
    private ImageView[] dots;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main5 );
        //slider
        introPager = findViewById( R.id.home_banner_pager );
        sliderDotspanel = findViewById( R.id.home_banner_pager_indicator );
        ViewPagerAdapter6 viewPagerAdapter = new ViewPagerAdapter6( this );

        introPager.setAdapter( viewPagerAdapter );

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];
        class MyTimerTask extends TimerTask {

            @Override
            public void run() {

            /*if (HomeActivity.this == null)
                return;*/
                runOnUiThread( new Runnable() {
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
    }}
