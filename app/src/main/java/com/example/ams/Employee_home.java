package com.example.ams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

public class Employee_home extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);


        initData();
        initRecylerView();
    }

    private void initRecylerView() {

         recyclerView = findViewById(R.id.employee_home_recycleview);
         layoutManager=new LinearLayoutManager(this);
         layoutManager.setOrientation(RecyclerView.VERTICAL);
         recyclerView.setLayoutManager(layoutManager);
         adapter=new AdapterForEmployeeHome(userList);


    }


}