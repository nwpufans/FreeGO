package com.example.smallning.freego;

import android.widget.ImageView;

/**
 * Created by Smallning on 2017/9/6.
 */

public class Item {
    private int ImageId;
    private String name;

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return ImageId;
    }

    public String getName() {
        return name;
    }
}
