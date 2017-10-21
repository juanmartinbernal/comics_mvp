package com.comicsopentrends.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 Created by Juan Martin Bernal on 20/10/2017.
 */
public class Character {

    @SerializedName("id")
    public int id;

    @SerializedName("description")
    public String description;

    @SerializedName("name")
    public String name;

    @SerializedName("thumbnail")
    public Thumbnail thumbnail;

    @SerializedName("comics")
    public Comic comic;

    @SerializedName("events")
    public Event event;

    @SerializedName("urls")
    public ArrayList<UrlCharacter> urls;
}
