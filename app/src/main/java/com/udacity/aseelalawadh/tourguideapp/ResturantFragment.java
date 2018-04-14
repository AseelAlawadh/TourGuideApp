package com.udacity.aseelalawadh.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResturantFragment extends Fragment {

    private ArrayList<Resturant> resturant;
    private ListView list_view;

    public ResturantFragment(ArrayList<Resturant> resturant) {
        this.resturant = resturant;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resturant, container, false);

        ResturantsAdapter adapter = new ResturantsAdapter(view.getContext(), resturant);
        list_view = view.findViewById(R.id.list_view);
        list_view.setAdapter(adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            }
        });

        return view;
    }
}