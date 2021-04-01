package com.example.ams.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {


    String baseurlOne="http://localhost:6042/api/Login";

   public static Retrofit getinstant(){
       String baseurl="http://localhost:6042";
       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(baseurl)
               .addConverterFactory(GsonConverterFactory.create())
               .build();
       return retrofit;

   }
}
