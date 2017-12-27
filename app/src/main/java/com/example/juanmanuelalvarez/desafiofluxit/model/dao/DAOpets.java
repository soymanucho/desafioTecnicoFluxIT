package com.example.juanmanuelalvarez.desafiofluxit.model.dao;

import android.content.Context;
import android.util.Log;
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
    private Pet petRecieved;


    public void getPetsFromApi(final ResultListener<List<Pet>> resultListener) {


        petList = new ArrayList<>();

        retrofit = new RetrofitAdapter().getAdapter();

        RetrofitService service = retrofit.create(RetrofitService.class);



        Call<List<Pet>> call = service.getPets();
        call.enqueue(new Callback<List<Pet>>() {
            @Override
            public void onResponse(Call<List<Pet>> call, Response<List<Pet>> response) {
                if (response.isSuccessful()){

                    petList = response.body();

                    resultListener.finish(petList);

                }else{
                    Log.v("error","Error en response DAOpetsList");
                }


            }

            @Override
            public void onFailure(Call<List<Pet>> call, Throwable t) {
                    Log.v("error1",t.getMessage());

            }
        });

    }

    public void getPetFromApiWithId(String idPetRecieved, final ResultListener<Pet> resultListener) {

        petRecieved = new Pet();

        retrofit = new RetrofitAdapter().getAdapter();

        RetrofitService service = retrofit.create(RetrofitService.class);

        Call<Pet> call = service.getPetWithId(idPetRecieved);

        call.enqueue(new Callback<Pet>() {
            @Override
            public void onResponse(Call<Pet> call, Response<Pet> response) {
                if (response.isSuccessful()){
                    petRecieved = response.body();
                    resultListener.finish(petRecieved);
                }else{
                    Log.v("error2","Error en response DAOpetsWithID");
                }
            }

            @Override
            public void onFailure(Call<Pet> call, Throwable t) {
                Log.v("error3",t.getMessage());
            }
        });



    }
}
