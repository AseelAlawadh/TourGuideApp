package com.udacity.aseelalawadh.tourguideapp;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class Places implements Parcelable {

    public static final Creator<Places> CREATOR = new Creator<Places>() {
        @Override
        public Places createFromParcel(Parcel in) {
            return new Places(in);
        }

        @Override
        public Places[] newArray(int size) {
            return new Places[size];
        }
    };
    private String name;
    private String address;

    public Places(String name, String address) {
        this.name = name;
        this.address = address;
    }

    protected Places(Parcel in) {
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
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.address);
    }
}
