
package com.lab2.lab5;

public class Main {
    
    public static void main(String[] args) {
        Car c=new Car();
        System.out.println("новый автомобиль : "+
                           "\n Name : " + c.nameV()+
                           "\n Color : " + c.ColorV()+
                           "\n year Model : " + c.yearModelV()+
                           "\n number Model : " + c.numberModelV());
        
        Motor m=new Motor();
        System.out.println("новый автомобиль : "+
                           "\n Name : " + m.nameV()+
                           "\n Color : " + m.ColorV()+
                           "\n year Model : " + m.yearModelV()+
                           "\n number Model : " + m.numberModelV());
    }
    
}
