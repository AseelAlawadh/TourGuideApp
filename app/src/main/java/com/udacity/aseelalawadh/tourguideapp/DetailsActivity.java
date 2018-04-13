package com.udacity.aseelalawadh.tourguideapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Find the view pager that will allow the user to swipe between fragments
        viewPager = findViewById(R.id.viewpager);

        Bundle extras = getIntent().getExtras();
        ArrayList<String> events = extras.getStringArrayList("EVENTS");
        ArrayList<String> places = extras.getStringArrayList("PLACES");
        ArrayList<String> resturants = extras.getStringArrayList("RESTURANT");
        ArrayList<String> malls = extras.getStringArrayList("MALLS");



        // Create an adapter that knows which fragment should be shown on each page
        DetailsFragmentPagerAdapter adapter = new DetailsFragmentPagerAdapter(getSupportFragmentManager());

        adapter.setEvents(events);
        adapter.setMalls(malls);
        adapter.setPlaces(places);
        adapter.setResturant(resturants);


        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);





    }
}
