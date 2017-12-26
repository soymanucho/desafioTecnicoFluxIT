package com.example.juanmanuelalvarez.desafiofluxit.model.dao;

import android.content.Context;
import android.widget.Toast;

import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.PetsContainer;
import com.example.juanmanuelalvarez.desafiofluxit.utils.RetrofitAdapter;
import com.example.juanmanuelalvarez.desafiofluxit.utils.RetrofitService;
import com.example.juanmanuelalvarez.desafiofluxit.utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public class DAOpets {


    private List<Pet> petList;
    private Retrofit retrofit;


    public void getPetsFromApi(final ResultListener<List<Pet>> resultListener) {


        petList = new ArrayList<>();

        retrofit = new RetrofitAdapter().getAdapter();

        RetrofitService service = retrofit.create(RetrofitService.class);



        Call<PetsContainer> call = service.getPets();
        call.enqueue(new Callback<PetsContainer>() {
            @Override
            public void onResponse(Call<PetsContainer> call, Response<PetsContainer> response) {
                if (response.isSuccessful()){

                    PetsContainer petsContainer = response.body();
                    petList = petsContainer.getPetsList();
                    resultListener.finish(petList);

                }else{
                    System.out.println("error");
                }


            }

            @Override
            public void onFailure(Call<PetsContainer> call, Throwable t) {

            }
        });

    }

}
