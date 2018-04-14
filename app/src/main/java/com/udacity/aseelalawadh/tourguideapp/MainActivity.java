package com.udacity.aseelalawadh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String STREET_SHOW = "Street Show";
    public static final String JBR = "JBR";
    public static final String AM = "9 AM";
    public static final String DUBAI_BRIDGE = "Dubai Bridge";
    public static final String DUABAI_MAIN_STREET = "Duabai Main Street";
    public static final String I_HOP = "iHop";
    public static final String DUBAI_MALL = "Dubai Mall";
    public static final String DUBAI_STREET = "Dubai Street";
    public static final String RIYADH_BRIDGE = "Riyadh Bridge";
    public static final String RIYADH_MAIN_STREET = "Riyadh Main Street";
    public static final String RIYADH_MALL = "Riyadh Mall";
    public static final String RIYADH_STREET = "Riyadh Street";
    private ListView list_view;
    private ArrayList<City> cities = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        City riaydhCity = this.riyadhCity();
        City dubaiCity = this.dubaiCity();

        cities.add(riaydhCity);
        cities.add(dubaiCity);

        MainAdapter adapter = new MainAdapter(this, cities);
        list_view = findViewById(R.id.list_view);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                City item = cities.get(position);

                intent.putParcelableArrayListExtra(getString(R.string.tagEvents), item.getEvents());
                intent.putParcelableArrayListExtra(getString(R.string.tagPlaces), item.getPlaces());
                intent.putParcelableArrayListExtra(getString(R.string.tagRESTURANT), item.getResturant());
                intent.putParcelableArrayListExtra(getString(R.string.tagMalls), item.getMalls());
                startActivity(intent);
            }
        });

    }

    City dubaiCity() {
        // content of Events !
        ArrayList<Event> events = new ArrayList<>();
        Event event1 = new Event(STREET_SHOW, JBR, AM);
        Event event2 = new Event(STREET_SHOW, JBR, AM);
        events.add(event1);
        events.add(event2);
        // content of Place
        ArrayList<Places> places = new ArrayList<>();
        Places place1 = new Places(DUBAI_BRIDGE, DUABAI_MAIN_STREET);
        places.add(place1);

        // content of Resturant !
        ArrayList<Resturant> resturants = new ArrayList<>();
        Resturant rest1 = new Resturant(I_HOP, DUBAI_MALL);
        resturants.add(rest1);

        // content of Malls !
        ArrayList<Mall> malls = new ArrayList<>();
        Mall mall1 = new Mall(DUBAI_MALL, DUBAI_STREET);
        malls.add(mall1);

        return new City(getString(R.string.cityName2), R.drawable.dubai, events, places, resturants, malls);
    }

    City riyadhCity() {
        // content of Events !
        ArrayList<Event> events = new ArrayList<>();
        Event event1 = new Event(STREET_SHOW, JBR, AM);
        Event event2 = new Event(STREET_SHOW, JBR, AM);
        events.add(event1);
        events.add(event2);
        // content of Place
        ArrayList<Places> places = new ArrayList<>();
        Places place1 = new Places(RIYADH_BRIDGE, RIYADH_MAIN_STREET);
        places.add(place1);

        // content of Resturant !
        ArrayList<Resturant> resturants = new ArrayList<>();
        Resturant rest1 = new Resturant(I_HOP, RIYADH_MALL);
        resturants.add(rest1);

        // content of Malls !
        ArrayList<Mall> malls = new ArrayList<>();
        Mall mall1 = new Mall(RIYADH_MALL, RIYADH_STREET);
        malls.add(mall1);

        return new City(getString(R.string.cityName1), R.drawable.riyadh, events, places, resturants, malls);
    }
}