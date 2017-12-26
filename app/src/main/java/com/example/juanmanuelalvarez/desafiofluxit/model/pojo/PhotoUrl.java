package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import org.simpleframework.xml.Element;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class PhotoUrl {

    private String photoUrl;

    public String getPhotoUrl ()
    {
        return photoUrl;
    }

    public void setPhotoUrl (String photoUrl)
    {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString()
    {
        return photoUrl;
    }

}
