package com.example.ams;

public class LoginResponse {
//String Data;
//boolean issuccess;
//String message;
//
//    public String getData() {
//        return Data;
//    }
//
//    public void setData(String data) {
//        Data = data;
//    }
//
//    public boolean isIssuccess() {
//        return issuccess;
//    }
//
//    public void setIssuccess(boolean issuccess) {
//        this.issuccess = issuccess;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    @Override
//    public java.lang.String toString() {
//        return "LoginResponse{" +
//                "Data='" + Data + '\'' +
//                ", issuccess=" + issuccess +
//                ", String='" + message + '\'' +
//                '}';
//    }

Data data;
boolean isSuccess;
String message;

    public LoginResponse(Data data, boolean isSuccess, String message) {
        this.data = data;
        this.isSuccess = isSuccess;
        this.message = message;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
