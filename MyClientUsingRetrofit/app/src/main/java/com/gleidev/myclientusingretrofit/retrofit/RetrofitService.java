package com.gleidev.myclientusingretrofit.retrofit;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitService {
    private Retrofit retrofit;

    public RetrofitService() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.15.57:8080")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
    }
}
