package com.udacity.aseelalawadh.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class DetailsFragmentPagerAdapter extends FragmentPagerAdapter {


    private ArrayList<String> malls;
    private ArrayList<String> events;
    private ArrayList<String> resturant;
    private ArrayList<String> places;
    private Context context;

    public DetailsFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

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

    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return new EventFragment(events);
        } else if (position == 1) {
            return new PlacesFragment(places);
        } else if (position == 2) {
            return new ResturantFragment(resturant);
        } else {
            return new MallsFragment(malls);
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return context.getString(R.string.event);
        } else if (position == 1) {
            return context.getString(R.string.places);
        } else if (position == 2) {
            return context.getString(R.string.resturant);
        } else {
            return context.getString(R.string.malls);
        }
    }


    @Override
    public int getCount() {
        return 4;
    }
}
