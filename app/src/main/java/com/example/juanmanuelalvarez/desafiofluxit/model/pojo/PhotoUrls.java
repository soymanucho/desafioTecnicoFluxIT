package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 26/12/2017.
 */

public class PhotoUrls {
    @SerializedName("photoUrls")
    private List<PhotoUrl> photoUrls;

    public List<PhotoUrl> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<PhotoUrl> photoUrls) {
        this.photoUrls = photoUrls;
    }
}
