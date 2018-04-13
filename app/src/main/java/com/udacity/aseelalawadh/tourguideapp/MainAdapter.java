package com.udacity.aseelalawadh.tourguideapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 11/04/2018.
 */

public class MainAdapter extends ArrayAdapter<String> {

    public MainAdapter(MainActivity context, ArrayList<String> artists) {
        super(context, 0, artists);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        String item = getItem(position);
        TextView id = listItemView.findViewById(R.id.id_textView);
        id.setText(String.valueOf(position + 1));
        TextView songName = listItemView.findViewById(R.id.title_textView);
        songName.setText(item);
        return listItemView;
    }
}
