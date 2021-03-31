package com.example.ams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
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
    List<ModelClassForEmployeeHome> userList;
    private AdapterForEmployeeHome adapterForEmployeeHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);

        initData();
        adapterForEmployeeHome = new AdapterForEmployeeHome(userList);

        initRecylerView();
    }

    private void initData() {

        userList = new ArrayList<>();
        userList.add(new ModelClassForEmployeeHome("10-11-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-12-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-13-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-11-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-12-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-13-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-11-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-12-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-13-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-11-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-12-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-13-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-11-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-12-20", "10.24", "11.00", "10.24", "present"));
        userList.add(new ModelClassForEmployeeHome("10-13-20", "10.24", "11.00", "10.24", "present"));
    }

    private void initRecylerView() {


        recyclerView = findViewById(R.id.employee_home_recycleview);
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterForEmployeeHome);


    }


}