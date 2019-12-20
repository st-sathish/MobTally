package com.kathreshtech.mobtally.data.network;

import java.util.ArrayList;
import java.util.List;

public class CompanyResponse {

    private List<Company> companies = new ArrayList<>();

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public class Company{

        private String name = "";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
