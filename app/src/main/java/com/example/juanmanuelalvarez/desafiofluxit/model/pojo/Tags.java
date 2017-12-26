package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

class Tags {

    @SerializedName("tags")
    private List<Tag> tags;

    private String status;

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
