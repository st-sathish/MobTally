package com.kathreshtech.mobtally.data;

public final class ApiConstants {

    private ApiConstants(){}

    public static final String BASE_API_DEV = "http://192.168.43.222:8080";
    public static final String BASE_API_PROD = "";
    public static final String BASE_API = BASE_API_DEV;
    public static final String API_COMPANY_LIST = BASE_API+"/api/v1/companies";
}
