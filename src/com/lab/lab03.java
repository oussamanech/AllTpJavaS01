
package com.lab;
//я вариант 7 --> 2
//2.Дан массив размерности N,  найти наименьший элемент массива и вывести на консоль
//(если наименьших элементов несколько — вывести их все).
public class lab03 {
    public static void main(String[] args) {
        int[] n ={1,2,3,4,-1,-5,-9,10,-9,20,50,100,1,-9,45,69};
        int min = n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i]<min)
                min=n[i];
        }
        System.out.println("наименьший элемент массива : "+min);
        // (если наименьших элементов несколько — вывести их все).
        for (int i = 0; i < n.length; i++) {
            if(n[i]== min)
               System.out.println("наименьший элемент массива ["+i+"] : "+min);
        }
        
    }
}
