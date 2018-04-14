package com.udacity.aseelalawadh.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class MainAdapter extends ArrayAdapter<City> {

    public MainAdapter(MainActivity context, ArrayList<City> items) {
        super(context, 0, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        City item = getItem(position);


        TextView cityName = listItemView.findViewById(R.id.title_textView);
        cityName.setText(item.getName());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (item.hasImage()) {
            imageView.setImageResource(item.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}