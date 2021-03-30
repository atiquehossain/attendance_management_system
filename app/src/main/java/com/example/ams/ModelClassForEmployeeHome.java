package com.example.ams;

import java.util.Date;

public class ModelClassForEmployeeHome {
    private String e_m_l_date;
    private String e_m_l_chekin;
    private String e_m_l_chekout;
    private String e_m_l_late;
    private String e_m_l_status;
//put the data
    //constructor
    public ModelClassForEmployeeHome(String e_m_l_date, String e_m_l_chekin, String e_m_l_chekout, String e_m_l_late, String e_m_l_status) {
        this.e_m_l_date = e_m_l_date;
        this.e_m_l_chekin = e_m_l_chekin;
        this.e_m_l_chekout = e_m_l_chekout;
        this.e_m_l_late = e_m_l_late;
        this.e_m_l_status = e_m_l_status;
    }


    //get data

    public String getE_m_l_date() {
        return e_m_l_date;
    }

    public String getE_m_l_chekin() {
        return e_m_l_chekin;
    }

    public String getE_m_l_chekout() {
        return e_m_l_chekout;
    }

    public String getE_m_l_late() {
        return e_m_l_late;
    }

    public String getE_m_l_status() {
        return e_m_l_status;
    }



}
