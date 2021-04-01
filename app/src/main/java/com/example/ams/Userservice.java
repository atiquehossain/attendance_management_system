package com.example.ams;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Userservice {

    @POST("security/LoginOTPLess")
    Call<LoginResponse> userlogin(@Body LoginRequest loginRequest);


}
