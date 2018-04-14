package com.udacity.aseelalawadh.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = findViewById(R.id.viewpager);

        Bundle extras = getIntent().getExtras();
        ArrayList<Event> events = extras.getParcelableArrayList(getString(R.string.tagEvents));
        ArrayList<Places> places = extras.getParcelableArrayList(getString(R.string.tagPlaces));
        ArrayList<Resturant> resturants = extras.getParcelableArrayList(getString(R.string.tagRESTURANT));
        ArrayList<Mall> malls = extras.getParcelableArrayList(getString(R.string.tagMalls));

        // Create an adapter that knows which fragment should be shown on each page
        DetailsFragmentPagerAdapter adapter = new DetailsFragmentPagerAdapter(this, getSupportFragmentManager());

        adapter.setEvents(events);
        adapter.setMalls(malls);
        adapter.setPlaces(places);
        adapter.setResturant(resturants);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}