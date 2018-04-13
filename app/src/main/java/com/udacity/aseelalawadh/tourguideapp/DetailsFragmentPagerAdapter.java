package com.udacity.aseelalawadh.tourguideapp;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class DetailsFragmentPagerAdapter extends FragmentPagerAdapter {


    public DetailsFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CityFragment();
        } else if (position == 1){
            return new EventFragment();
        } else if (position == 2) {
            return new CityFragment();
        } else if (position == 3) {
            return new EventFragment();
        } else {
            return new CityFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
