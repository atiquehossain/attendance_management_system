package com.example.ams;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Date;
import java.util.List;

public class AdapterForEmployeeHome extends RecyclerView.Adapter<AdapterForEmployeeHome.ViewHolder> {

    private List<ModelClassForEmployeeHome> userList;

    public AdapterForEmployeeHome(List<ModelClassForEmployeeHome>userList){
        this.userList=userList;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_attendance_list,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Date newDate=userList.get(position).getE_m_l_date();
        Date newcheckin=userList.get(position).getE_m_l_chekin();
        Date newcheckout= userList.get(position).getE_m_l_chekout();
        Date newLate=userList.get(position).getE_m_l_late();
        String newStatus=userList.get(position).getE_m_l_status();


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
