package com.udacity.aseelalawadh.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;



public class EventFragment extends Fragment {

    private ListView list_view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);

        ArrayList<String> events = new ArrayList<>();
        for (int i = 0; i< 5; i++) {

            String event = new String("event" + (i+1));
            events.add(event);
        }


        EventAdapter adapter = new EventAdapter(view.getContext(), events);
        list_view = view.findViewById(R.id.list_view);
        list_view.setAdapter(adapter);

        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.v("TAG: CityFragment", "clicked");
            }
        });

        return view;
    }
}
