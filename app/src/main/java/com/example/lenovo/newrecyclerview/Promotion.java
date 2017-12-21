package com.example.lenovo.newrecyclerview;

/**
 * Created by lenovo on 20-Dec-17.
 */

public class Promotion {

        private int id;
        private String title;
        private String shortdesc;
        private String category;
        private String subcategory;
        private int image;

    public Promotion(int id, String title, String shortdesc, String category, String subcategory, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.category = category;
        this.subcategory = subcategory;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getCategory() {
        return category;
    }

    public String getSubcategory() {
        return subcategory;
    }

    public int getImage() {
        return image;
    }
}
