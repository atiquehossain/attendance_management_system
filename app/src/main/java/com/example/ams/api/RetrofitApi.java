package com.example.ams.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {


    String baseurlOne="https://BLVWBIOTEST.banglalink.net/ResellerApp/api/security/ LoginOTPLess";

   public static Retrofit getinstant(){
       String baseurl="https://BLVWBIOTEST.banglalink.net/ResellerApp/api/";
       Retrofit retrofit = new Retrofit.Builder()
               .baseUrl(baseurl)
               .addConverterFactory(GsonConverterFactory.create())
               .build();
       return retrofit;

   }
}
