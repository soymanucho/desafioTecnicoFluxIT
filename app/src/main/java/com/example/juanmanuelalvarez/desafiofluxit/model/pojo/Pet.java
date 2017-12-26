package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */
@Root(name = "Pet")
public class Pet {

    @Element(name = "id")
    private String id;
    @Element(name = "tags")
    private Tags tags;
    @Element(name = "category")
    private Category category;
    @Element(name = "status")
    private String status;
    @Element(name = "name")
    private String name;
    @Element(name = "photoUrls")
    private PhotoUrls photoUrls;

    public String getId (){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }

    public Tags getTags (){
        return tags;
    }

    public void setTags (Tags tags){
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

    public PhotoUrls getPhotoUrls (){
        return photoUrls;
    }

    public void setPhotoUrls (PhotoUrls photoUrls){
        this.photoUrls = photoUrls;
    }

    @Override
    public String toString(){
        return name;
    }
}