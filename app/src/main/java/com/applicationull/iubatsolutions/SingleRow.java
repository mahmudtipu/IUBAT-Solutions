package com.applicationull.iubatsolutions;

/**
 * Created by Tipu on 2/16/2018.
 */

public class SingleRow {
    String name;
    int image;

    public SingleRow(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
