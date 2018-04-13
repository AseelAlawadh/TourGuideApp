package com.udacity.aseelalawadh.tourguideapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<String> {

    public EventAdapter(Context context, ArrayList<String> events) {
        super(context, 0, events);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_title, parent, false);
        }

        String item = getItem(position);
        TextView id = listItemView.findViewById(R.id.id_textView);
        id.setText(String.valueOf(position + 1));
        TextView songName = listItemView.findViewById(R.id.title_textView);
        songName.setText(item);
        return listItemView;
    }
}
