package com.udacity.aseelalawadh.tourguideapp;

import java.util.ArrayList;

/**
 * Created by aseelalawadh on 13/04/2018.
 */
public class City {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String name;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private ArrayList<Mall> malls;
    private ArrayList<Event> events;
    private ArrayList<Resturant> resturant;
    private ArrayList<Places> places;

    public City(String name, int imageResourceId, ArrayList<Event> events, ArrayList<Places> places, ArrayList<Resturant> resturant, ArrayList<Mall> malls) {
        this.name = name;
        this.imageResourceId = imageResourceId;
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

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    //Return if item has image or not
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    public ArrayList<Mall> getMalls() {
        return malls;
    }

    public void setMalls(ArrayList<Mall> malls) {
        this.malls = malls;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Resturant> getResturant() {
        return resturant;
    }

    public void setResturant(ArrayList<Resturant> resturant) {
        this.resturant = resturant;
    }

    public ArrayList<Places> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Places> places) {
        this.places = places;
    }
}