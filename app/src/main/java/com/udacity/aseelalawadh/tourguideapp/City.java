package com.udacity.aseelalawadh.tourguideapp;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 13/04/2018.
 */

public class City {
    private String name;
    private ArrayList<String> malls;
    private ArrayList<String> events;
    private ArrayList<String> resturant;
    private ArrayList<String> places;

    public City(String name, ArrayList<String> events, ArrayList<String> places, ArrayList<String> resturant, ArrayList<String> malls) {
        this.name = name;
        this.malls = malls;
        this.events = events;
        this.resturant = resturant;
        this.places = places;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getMalls() {
        return malls;
    }

    public void setMalls(ArrayList<String> malls) {
        this.malls = malls;
    }

    public ArrayList<String> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<String> events) {
        this.events = events;
    }

    public ArrayList<String> getResturant() {
        return resturant;
    }

    public void setResturant(ArrayList<String> resturant) {
        this.resturant = resturant;
    }

    public ArrayList<String> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<String> places) {
        this.places = places;
    }
}
