package com.example.ams;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ams.api.RetrofitApi;


import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView email;
    TextView password;

    // try to convert Boolean
//    CheckBox isRememberMe =(CheckBox) findViewById(R.id.massage);
//    Boolean checkbox=isRememberMe.isChecked();
   CheckBox isRememberMe;

    Userservice user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        email = findViewById(R.id.emailname);
        password = findViewById(R.id.password);
        isRememberMe=findViewById(R.id.massage);
        isRememberMe.setChecked(true);

        //String convert
        String stremail=email.getText().toString();
        String strpassword=password.getText().toString();
        boolean getcheck= isRememberMe.isChecked();
//        Retrofit retrofitApi;
//        retrofitApi =RetrofitApi.getinstant();

//        Userservice service= retrofitApi.create(Userservice.class);
//       Call<LoginResponse> servicecall =service.loginUserV2(new LoginRequest("String@gmail.com","emkqdazcvc",true));
//
//        servicecall.enqueue(new Callback<LoginResponse>() {
//                        @Override
//                        public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
//                            if(response.isSuccessful()){
//                                Log.d("responseok", "onResponse: "+response.body().toString());
//                                Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();
//
//                            }
//                            else {
//                                Log.d("responsefa3se", "onResponse: ");
//                                Toast.makeText(MainActivity.this, "else", Toast.LENGTH_SHORT).show();
//
//                            }
//                        }

//                        @Override
//                        public void onFailure(Call<LoginResponse> call, Throwable t) {
//
//                            Log.d("responseok", "onResponse: "+t.toString());
//                            Toast.makeText(MainActivity.this, "failure", Toast.LENGTH_SHORT).show();
//
//                        }
//                    });






        // user =RetrofitApi.getinstant().create(Userservice.class);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




//                    user.userlogin(new LoginRequest()).enqueue(new Callback<String>() {
//                        @Override
//                        public void onResponse(Call<String> call, Response<String> response) {
//                            if(response.isSuccessful()){
//
//                            }
//                        }
//
//                        @Override
//                        public void onFailure(Call<String> call, Throwable t) {
//
//                        }
//                    });

                    //openNewActivity();
//
//                    Userservice newuserservice = RetrofitApi
//                            .getInstance()
//                            .getApi();
//                newuserservice.loginUserV2(new DemoModel("R230018","kxqlzABQYn5olccbvuuBTuPeZBsuaZAq3UDe5LtxjeK08dQkYq8mbTREMnBe/C9zep4k9uqjkqFD58+m92iNxG2aHmONIMCmhPt8rNDF6Idkl/bcmdqpxdE0R6c75oh4")).enqueue(new Callback<DemoResponseModel>() {
//                    @Override
//                    public void onResponse(Call<DemoResponseModel> call, Response<DemoResponseModel> response) {
//                     if(response.isSuccessful()){
//                         Log.d("responseok", "onResponse: "+response.body().toString());
//                     }
//                     else {
//                         Log.d("responsefa3se", "onResponse: ");
//                     }
//                    }
//
//                    @Override
//                    public void onFailure(Call<DemoResponseModel> call, Throwable t) {
//                        Log.d("responseok", "onResponse: "+t.toString());
//                    }
//                });
Call<LoginResponse> call= RetrofitApi.getInstance().getService().login(stremail,strpassword, getcheck);

call.enqueue(new Callback<LoginResponse>() {
    @Override
    public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
LoginResponse loginResponse=response.body();

if(response.isSuccessful()){
    openNewActivity();
    Toast.makeText(MainActivity.this,loginResponse.getMessage(),Toast.LENGTH_SHORT).show();
}
else {
    Toast.makeText(MainActivity.this, "failed", Toast.LENGTH_SHORT).show();
    Log.d("FailedResponse", "onResponse: ");
}
    }

    @Override
    public void onFailure(Call<LoginResponse> call, Throwable t) {

        Toast.makeText(MainActivity.this,t.getMessage(),Toast.LENGTH_SHORT).show();
    }
});





            }
        });


    }

    public void openNewActivity() {
        Intent intent = new Intent(this, Employee_home.class);


        startActivity(intent);
    }

    private boolean validation() {
        boolean flag = true;
        if (email.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "You must enter email  to login", Toast.LENGTH_SHORT).show();
            flag = false;
        } else if (email.getText().toString().length() < 4) {
            Toast.makeText(MainActivity.this, "user name must be more then 4 char", Toast.LENGTH_SHORT).show();
            flag = false;
        } else if (password.getText().toString().isEmpty()) {
            Toast.makeText(MainActivity.this, "You must enter password  to login!", Toast.LENGTH_SHORT).show();
            flag = false;
        }

        return flag;
    }
}