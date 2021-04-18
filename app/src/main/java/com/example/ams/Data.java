package com.example.ams;

public class Data {

    int id;
    String name;
    String designation;
    String celL_NO;
    String email;
    String address;
    String nid;
    String password;
    String Admin;

    public Data(int id, String name, String designation, String celL_NO, String email, String address, String nid, String password, String admin) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.celL_NO = celL_NO;
        this.email = email;
        this.address = address;
        this.nid = nid;
        this.password = password;
        Admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCelL_NO() {
        return celL_NO;
    }

    public void setCelL_NO(String celL_NO) {
        this.celL_NO = celL_NO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String admin) {
        Admin = admin;
    }
}
