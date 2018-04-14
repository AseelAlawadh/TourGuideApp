package com.udacity.aseelalawadh.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class Mall implements Parcelable {

    public static final Creator<Mall> CREATOR = new Creator<Mall>() {
        @Override
        public Mall createFromParcel(Parcel in) {
            return new Mall(in);
        }

        @Override
        public Mall[] newArray(int size) {
            return new Mall[size];
        }
    };
    private String name;
    private String address;

    public Mall(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected Mall(Parcel in) {
        name = in.readString();
        address = in.readString();
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(address);
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
}
