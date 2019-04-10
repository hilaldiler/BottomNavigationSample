package com.example.bottomnavigationsample.model;

public class FoodList {
    private String name;
    private String calori;


    public FoodList(String name, String calori) {
        this.calori = calori;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalori() {

        return calori;
    }

    public void setCalori(String calori) {

        this.calori = calori;
    }
}
