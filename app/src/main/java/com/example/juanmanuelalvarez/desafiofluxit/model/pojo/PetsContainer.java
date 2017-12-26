package com.example.juanmanuelalvarez.desafiofluxit.model.pojo;

import com.google.gson.annotations.SerializedName;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */
public class PetsContainer {

    @SerializedName("pets")
    private List<Pet> petsList;

    public PetsContainer(List<Pet> petsList) {
        this.petsList = petsList;
    }

    public List<Pet> getPetsList() {
        return petsList;
    }

    public void setPetsList(List<Pet> petsList) {
        this.petsList = petsList;
    }
}
