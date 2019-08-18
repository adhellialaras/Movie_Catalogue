package com.abdhilabs.submission4.api;

import com.abdhilabs.submission4.BuildConfig;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRetrofit {

    private static Retrofit getRetroClient() {
        return new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ClientService getServiceRetrofit() {
        return getRetroClient().create(ClientService.class);
    }
}
