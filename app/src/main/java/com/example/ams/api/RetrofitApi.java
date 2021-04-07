package com.example.ams.api;

import com.example.ams.Userservice;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {


//    String baseurlOne="http://localhost:6042/api/Login";
//
//   public static Retrofit getinstant(){
//       String baseurl="http://localhost:6042";
//       Retrofit retrofit = new Retrofit.Builder()
//               .baseUrl(baseurl)
//               .addConverterFactory(GsonConverterFactory.create())
//               .build();
//       return retrofit;
//
//   }

    private static final String Base_url="http://27.147.159.194:81/api/";
    private static RetrofitApi mInstance;
    private Retrofit retrofit;
    private RetrofitApi(){
        retrofit=new Retrofit.Builder()
                .baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitApi getInstance(){
        if(mInstance==null){
            mInstance=new RetrofitApi();
        }
        return mInstance;
    }
    public Userservice getApi(){
        return retrofit.create(Userservice.class);

    }


}
