package com.udacity.aseelalawadh.tourguideapp;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.ArrayList;


public class DetailsFragmentPagerAdapter extends FragmentPagerAdapter {


    private ArrayList<String> malls;
    private ArrayList<String> events;
    private ArrayList<String> resturant;
    private ArrayList<String> places;

    public void setMalls(ArrayList<String> malls) {
        this.malls = malls;
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public void setResturant(ArrayList<String> resturant) {
        this.resturant = resturant;
    }

    public void setPlaces(ArrayList<String> places) {
        this.places = places;
    }

    public DetailsFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.v("DetailsFragmentPagerAdapter", String.valueOf(position));

        if (position == 0) {
            return new EventFragment(events);
        } else if (position == 1){
            return new PlacesFragment(places);
        } else if (position == 2) {
            return new ResturantFragment(resturant);
        } else {
            return new MallsFragment(malls);
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
