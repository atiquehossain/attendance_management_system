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

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView email;
    TextView password;
   // CheckBox isRememberMe =(CheckBox) findViewById(R.id.massage);
    //Boolean checkbox=isRememberMe.isChecked();
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




        // user =RetrofitApi.getinstant().create(Userservice.class);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (validation()) {

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

                    Call<LoginResponse> call= RetrofitApi
                            .getInstance()
                            .getApi()
                            .loginuser(email.getText().toString(),
                                    password.getText().toString(),
                                    true);
                    call.enqueue(new Callback<LoginResponse>() {
                        @Override
                        public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                           if(response.isSuccessful()){
                               Log.e("njxcz",response.body().toString());
                           }
                            else {
                               Log.e("njxsscdz","error");
                           }

                        }

                        @Override
                        public void onFailure(Call<LoginResponse> call, Throwable t) {
                            Log.e("njxsscz",t.toString());


                        }
                    });
                }
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