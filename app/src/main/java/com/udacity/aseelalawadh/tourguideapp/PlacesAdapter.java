package com.udacity.aseelalawadh.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Context context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_title, parent, false);
        }

        Places item = getItem(position);

        TextView name = listItemView.findViewById(R.id.name_textView);
        name.setText(item.getName());
        TextView address = listItemView.findViewById(R.id.address_textView);
        address.setText(item.getAddress());
        return listItemView;
    }
}