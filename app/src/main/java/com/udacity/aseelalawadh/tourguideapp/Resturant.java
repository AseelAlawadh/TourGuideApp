package com.udacity.aseelalawadh.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class Resturant implements Parcelable {

    public static final Creator<Resturant> CREATOR = new Creator<Resturant>() {
        @Override
        public Resturant createFromParcel(Parcel in) {
            return new Resturant(in);
        }

        @Override
        public Resturant[] newArray(int size) {
            return new Resturant[size];
        }
    };
    private String name;
    private String address;

    public Resturant(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected Resturant(Parcel in) {
        name = in.readString();
        address = in.readString();
    }



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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(this.name);
        dest.writeString(this.address);
    }
}
