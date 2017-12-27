package com.example.juanmanuelalvarez.desafiofluxit.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by Juan Manuel Alvarez on 26/12/2017.
 */

public class RetrofitAdapter {

    private Retrofit retrofit;

    public RetrofitAdapter(){

    }

    public Retrofit getAdapter(){

        retrofit = new Retrofit.Builder()
                .baseUrl("http://petstore.swagger.io/v2")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;

    }


}
