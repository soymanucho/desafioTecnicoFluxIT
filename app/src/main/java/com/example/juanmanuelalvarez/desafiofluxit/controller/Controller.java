package com.example.juanmanuelalvarez.desafiofluxit.controller;

import android.content.Context;
import android.util.Log;

import com.example.juanmanuelalvarez.desafiofluxit.model.dao.DAOpets;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.utils.ResultListener;

import java.util.List;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class Controller {

    private Context context;

    public Controller (Context context){
        this.context=context;
    }

    public void getListFromDaoPets(final ResultListener<List<Pet>> listenerActivity){
        DAOpets DAOpets = new DAOpets();

        DAOpets.getPetsFromApi(new ResultListener<List<Pet>>() {
            @Override
            public void finish(List<Pet> resultado) {
                if (resultado != null){
                    listenerActivity.finish(resultado);
                }else{
                    Log.v("error","Error en Controller");

                }
            }
        });
    }

    public void getPetDetailFromDaoWithId(String idPetRecieved, final ResultListener<Pet> resultListenerActivity) {

        DAOpets daOpets = new DAOpets();

        daOpets.getPetFromApiWithId(idPetRecieved, new ResultListener<Pet>() {
            @Override
            public void finish(Pet resultado) {
                resultListenerActivity.finish(resultado);
            }
        });


    }
}
