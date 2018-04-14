package com.udacity.aseelalawadh.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EventAdapter extends ArrayAdapter<Event> {

    public EventAdapter(Context context, ArrayList<Event> events) {
        super(context, 0, events);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_title, parent, false);
        }

        Event item = getItem(position);
        TextView name = listItemView.findViewById(R.id.name_textView);
        name.setText(item.getName());
        TextView address = listItemView.findViewById(R.id.address_textView);
        address.setText(item.getAddress());
        return listItemView;
    }
}