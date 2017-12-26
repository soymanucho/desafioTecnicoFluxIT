package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class Pet {

    private String id;

    private List<Tags> tags;

    private Category category;

    private String status;

    private String name;

    private PhotoUrl photoUrl;

    public String getId (){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Category getCategory (){
        return category;
    }

    public void setCategory (Category category){
        this.category = category;
    }

    public String getStatus (){
        return status;
    }

    public void setStatus (String status){
        this.status = status;
    }

    public String getName (){
        return name;
    }

    public void setName (String name){
        this.name = name;
    }

    public PhotoUrl getPhotoUrl(){
        return photoUrl;
    }

    public void setPhotoUrl(PhotoUrl photoUrl){
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString(){
        return name;
    }
}