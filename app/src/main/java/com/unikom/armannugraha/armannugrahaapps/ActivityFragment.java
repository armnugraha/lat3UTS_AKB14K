package com.unikom.armannugraha.armannugrahaapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cn.hugeterry.coordinatortablayout.CoordinatorTabLayout;

/**
 * Nama: Arman Nugraha
 * Nim: 10116916
 * Kelas: AKB 14K
 * Created_at: 20-04-2019
 */

public class ActivityFragment extends Fragment {

//    private CoordinatorTabLayout mCoordinatorTabLayout;
//    private int[] mImageArray, mColorArray;
//    private ArrayList<Fragment> mFragments;
//    private final String[] mTitles = {"Android", "iOS", "Web", "Other"};
//    private ViewPager mViewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //Add the fragment to the viewpager
//        initFragments();
//        initViewPager();
//        //Image array
//        mImageArray = new int[]{
//                R.mipmap.ic_launcher,
//                R.mipmap.ic_launcher_round,
//                R.mipmap.ic_launcher_round,
//                R.mipmap.ic_launcher};
//
//        mCoordinatorTabLayout = (CoordinatorTabLayout) getView().findViewById(R.id.coordinatortablayout);
//        mCoordinatorTabLayout.setTitle("Demo")
//                .setImageArray(mImageArray)
//                .setupWithViewPager(mViewPager);
//
//        mColorArray = new int[]{
//                android.R.color.holo_blue_light,
//                android.R.color.holo_red_light,
//                android.R.color.holo_orange_light,
//                android.R.color.holo_green_light};
//        mCoordinatorTabLayout.setImageArray(mImageArray, mColorArray);
//
//        mCoordinatorTabLayout.setTranslucentStatusBar(activity);
//        mCoordinatorTabLayout.setTranslucentNavigationBar(activity);
//        mCoordinatorTabLayout.setBackEnable(true);
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            finish();
//        }
//        return super.onOptionsItemSelected(item);
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity, container, false);
        return view;
    }

//    private void initFragments() {
//        mFragments = new ArrayList<>();
//        for (String title : mTitles) {
//            mFragments.add(MainFragment.getInstance(title));
//        }
//    }
//
//    private void initViewPager() {
//        mViewPager = (ViewPager) getView().findViewById(R.id.vp);
//        mViewPager.setOffscreenPageLimit(4);
//        mViewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), mFragments, mTitles));
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == android.R.id.home) {
//            finish();
//        }
//
//        switch (item.getItemId()) {
//            case R.id.action_about:
//                IntentUtils.openUrl(this, "https://github.com/hugeterry/CoordinatorTabLayout");
//                break;
//            case R.id.action_about_me:
//                IntentUtils.openUrl(this, "http://hugeterry.cn/about");
//                break;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
}
