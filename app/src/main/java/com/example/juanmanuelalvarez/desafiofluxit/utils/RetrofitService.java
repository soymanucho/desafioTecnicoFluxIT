package com.example.juanmanuelalvarez.desafiofluxit.utils;

import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.Pet;
import com.example.juanmanuelalvarez.desafiofluxit.model.pojo.PetsContainer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Juan Manuel Alvarez on 23/12/2017.
 */

public interface RetrofitService {

    @GET("pet/findByStatus?status=available")
    Call<List<Pet>> getPets();



    @GET("pet/{idPetRecieved}")
    Call<Pet> getPetWithId(@Path("idPetRecieved")String idPetRecieved);



}
