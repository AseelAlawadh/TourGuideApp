package com.udacity.aseelalawadh.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class Event implements Parcelable {

    private String name;
    private String address;
    private String time;

    public Event(String name, String address, String time) {
        this.name = name;
        this.address = address;
        this.time = time;
    }

    protected Event(Parcel in) {
        name = in.readString();
        address = in.readString();
        time = in.readString();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.address);
        dest.writeString(this.time);
    }



}
