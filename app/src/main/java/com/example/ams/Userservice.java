package com.example.ams;

import android.widget.CheckBox;
import android.widget.TextView;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Userservice {
    @FormUrlEncoded
    @POST("Login")
    Call<LoginResponse> loginuser(
            @Field("email") String email,
            @Field("password") String password,
            @Field("isRememberMe") boolean isRememberMe
    );


}
