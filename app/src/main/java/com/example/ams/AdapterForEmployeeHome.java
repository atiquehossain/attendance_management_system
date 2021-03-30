package com.example.ams;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        //View is building user interface
        //LayoutInflater is used to create a new View

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.employee_attendance_list,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String newDate=userList.get(position).getE_m_l_date();
        String newcheckin=userList.get(position).getE_m_l_chekin();
        String newcheckout= userList.get(position).getE_m_l_chekout();
        String newLate=userList.get(position).getE_m_l_late();
        String newStatus=userList.get(position).getE_m_l_status();
        
        
        holder.setData( newDate,newcheckin,newcheckout,newLate,newStatus);


    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textviewone;
        private TextView textviewtwo;
        private TextView textviewthree;
        private TextView textviewfour;
        private TextView textviewfive;




        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
        textviewone=itemView.findViewById(R.id.e_m_l_date);
        textviewtwo=itemView.findViewById(R.id.e_m_l_chekin);
        textviewthree=itemView.findViewById(R.id.e_m_l_chekout);
        textviewfour=itemView.findViewById(R.id.e_m_l_late);
        textviewfive=itemView.findViewById(R.id.e_m_l_status);
        }



        public void setData(String newDate, String newcheckin, String newcheckout, String newLate, String newStatus) {
            textviewone.setText(newDate.toString());
            textviewtwo.setText(newcheckin.toString());
            textviewthree.setText(newcheckout.toString());
            textviewfour.setText(newLate.toString());
            textviewfive.setText(newStatus);
        }
    }
}
