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

public class MallsAdapter extends ArrayAdapter<String> {

    public MallsAdapter(Context context, ArrayList<String> items) {
        super(context, 0, items);
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
