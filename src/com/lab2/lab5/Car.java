package com.lab2.lab5;

public class Car implements Vehicle{

    @Override
    public String nameV() {
       return "Ford";
    }

    @Override
    public String ColorV() {
        return "Белая";
    }

    @Override
    public int yearModelV() {
      return 2010;
    }

    @Override
    public int numberModelV() {
        return 123456123;
    }

    @Override
    public String toString() {
        return super.toString();
    }
  
    
    
}
