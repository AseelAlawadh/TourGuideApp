package com.udacity.aseelalawadh.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView list_view;
    private ArrayList<City> cities = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> events = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String item = new String("Event" + (i + 1));
            events.add(item);
        }

        ArrayList<String> places = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            String item = new String("Place" + (i + 1));
            places.add(item);
        }
        ArrayList<String> resturants = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String item = new String("Resturant" + (i + 1));
            resturants.add(item);
        }
        ArrayList<String> malls = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            String item = new String("Mall" + (i + 1));
            malls.add(item);
        }

        City riaydhCity = new City("Riyadh", R.drawable.riyadh, events, places, resturants, malls);
        City dubaiCity = new City("Dubai", R.drawable.dubai, events, places, resturants, malls);

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

                intent.putStringArrayListExtra("EVENTS", item.getEvents());
                intent.putStringArrayListExtra("PLACES", item.getPlaces());
                intent.putStringArrayListExtra("RESTURANT", item.getResturant());
                intent.putStringArrayListExtra("MALLS", item.getMalls());
                startActivity(intent);
            }
        });

    }
}
