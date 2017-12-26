package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import org.simpleframework.xml.Element;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class Category {


    private String id;

    private String name;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", name = "+name+"]";
    }
}
