
package com.lab;

import static java.lang.Math.*;

public class lab06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
        for(int i = 0; i <  arr.length; i++) {
	System.out.print(arr[i] + "  ");
        }
        double sum=0;
        for(int i = 0; i < arr.length; i++) {
           sum+= arr[i];
        }
        double mean=sum/arr.length;
        System.out.println("\n среднее арифметическое : " + mean);
        

    }
}
