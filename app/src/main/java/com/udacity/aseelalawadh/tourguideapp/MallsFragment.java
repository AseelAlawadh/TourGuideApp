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
public class MallsFragment extends Fragment {

    private ListView list_view;

    private ArrayList<Mall> malls;

    public MallsFragment(ArrayList<Mall> malls) {
        this.malls = malls;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_malls, container, false);

        MallsAdapter adapter = new MallsAdapter(view.getContext(), malls);
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