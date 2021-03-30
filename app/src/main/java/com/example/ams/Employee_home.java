package com.example.ams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

public class Employee_home extends AppCompatActivity {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    Adapter adapter;
    List<ModelClassForEmployeeHome> userList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);


        initData();
        initRecylerView();
    }

    private void initData() {

        userList=new ArrayList<>();
        userList.add(new ModelClassForEmployeeHome("10-10-20","10.24","11.00","10.24","present"));
    }

    private void initRecylerView() {

         recyclerView = findViewById(R.id.employee_home_recycleview);
         layoutManager=new LinearLayoutManager(this);
         layoutManager.setOrientation(RecyclerView.VERTICAL);
         recyclerView.setLayoutManager(layoutManager);
         adapter= (Adapter) new AdapterForEmployeeHome(userList);
         recyclerView.setAdapter((RecyclerView.Adapter) adapter);
         ((RecyclerView.Adapter) adapter).notifyDataSetChanged();


    }


}