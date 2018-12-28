package com.example.sys.online_shopping.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sys.online_shopping.R;
import com.example.sys.online_shopping.Recycleradapter.TabPagerAdapter;

public class Tab_fragment  extends Fragment {

    int position;
    private TextView textView;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    public static Fragment getInstance(int position) {
        Bundle bundle = new Bundle();
        bundle.putInt("pos", position);
        Tab_fragment tabFragment = new Tab_fragment();
        tabFragment.setArguments(bundle);
        return tabFragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        position = getArguments().getInt("pos");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_tab, container, false);
        mViewPager = view.findViewById(R.id.products_viewPager);
        mTabLayout = view.findViewById(R.id.tabs);
        setUpViewPager();

        mViewPager.setOffscreenPageLimit(1);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.mTabLayout));
        mTabLayout.addOnTabSelectedListener(new TabSelectedListener());
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        textView = (TextView) view.findViewById(R.id.textView);
//
//        textView.setText("Fragment " + (position + 1));

    }
    class TabSelectedListener implements TabLayout.OnTabSelectedListener {
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            /*LinearLayout tabLayout = (LinearLayout)((ViewGroup) mTabLayout.getChildAt(0)).getChildAt(tab.getPosition());
            TextView tabTextView = (TextView) tabLayout.getChildAt(1);
            tabTextView.setTypeface(tabTextView.getTypeface(), Typeface.NORMAL);*/
        }



        public void onTabSelected(TabLayout.Tab tab) {
            /*LinearLayout tabLayout = (LinearLayout)((ViewGroup) mTabLayout.getChildAt(0)).getChildAt(tab.getPosition());
            TextView tabTextView = (TextView) tabLayout.getChildAt(1);
            tabTextView.setTypeface(tabTextView.getTypeface(), Typeface.BOLD);*/
            mViewPager.setCurrentItem(tab.getPosition());
        }
    }
    private void setUpViewPager() {

        TabPagerAdapter adapter = new TabPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFrag(new exploreFragment(), "Men");
        adapter.addFrag(new bestsellerfragment(), "Women");
        adapter.addFrag(new exploreFragment(), "Kids");
        adapter.addFrag(new exploreFragment(), "Casual");

        mViewPager.setAdapter(adapter);

        // viewPager.setOffscreenPageLimit(-1);
        adapter.notifyDataSetChanged();

    }
}
