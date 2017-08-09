package com.example.kemo.pager;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    Activity activity;
    public PagerAdapter(Activity activity, FragmentManager fm) {
        super(fm);
        this.activity = activity;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0: {
                return new OneFragment();

            }

            case 1: {
                return new TwoFragment();
            }

        }
        return new ThreeFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "one";

            case 1:
                return "two";

        }

        return "three";
    }

}
