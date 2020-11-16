package com.lab2.lab5;

public class Motor implements Vehicle{
    @Override
    public String nameV() {
       return "Motor01";
    }

    @Override
    public String ColorV() {
        return "черный";
    }

    @Override
    public int yearModelV() {
      return 2015;
    }

    @Override
    public int numberModelV() {
        return 987654;
    }
     
}
