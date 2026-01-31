package com.example.assignment1_androidviews;

public class ItemModel {
    private String name;
    private String description;

    public ItemModel(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
}
