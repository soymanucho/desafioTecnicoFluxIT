package com.example.juanmanuelalvarez.desafiofluxit.utils;

import retrofit2.Retrofit;
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
                .baseUrl("http://petstore.swagger.io/")
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit;

    }


}
