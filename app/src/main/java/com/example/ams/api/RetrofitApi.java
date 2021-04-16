package com.example.ams.api;

import com.example.ams.Userservice;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {


   // String baseurlOne="http://localhost:6042/api/Login";

//   public static Retrofit getinstant(){
//       String baseurl="http://27.147.159.194:81/api/";
//       Retrofit retrofit = new Retrofit.Builder()
//               .baseUrl(baseurl)
//               .addConverterFactory(GsonConverterFactory.create())
//               .build();
//       return retrofit;
//
//   }

//    private static final String Base_url="https://blvwbiotest.banglalink.net/ResellerApp/api/";
//    private static RetrofitApi mInstance;
//    private Retrofit retrofit;
//    private RetrofitApi(){
//        retrofit=new Retrofit.Builder()
//                .baseUrl(Base_url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//    }
//
//    public static synchronized RetrofitApi getInstance(){
//        if(mInstance==null){
//            mInstance=new RetrofitApi();
//        }
//        return mInstance;
//    }
//    public Userservice getApi(){
//        return retrofit.create(Userservice.class);
//
//    }


//    private static String API_Base_URL="http://27.147.159.194:81/api/";
//    private static Retrofit retrofit;
//    private static Gson gson;
//
//    public static Retrofit getRetrofitInstance(){
//        if(retrofit==null){
//            gson=new GsonBuilder().setLenient().create();
//            retrofit=new Retrofit.Builder().baseUrl(API_Base_URL)
//                    .addConverterFactory(GsonConverterFactory.create(gson))
//                    .build();
//        }
//        return  retrofit;
//    }
//
//        public Userservice getApi(){
//        return retrofit.create(Userservice.class);
//
//    }


}
