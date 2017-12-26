package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

class Tags {

    @ElementList(name = "tags")
    private List<Tag> tags;

    public List<Tag> getTags ()
    {
        return tags;
    }

    public void setTag (List<Tag> tags)
    {
        this.tags = tags;
    }

    @Override
    public String toString()
    {
        return tags.toString();
    }
}
