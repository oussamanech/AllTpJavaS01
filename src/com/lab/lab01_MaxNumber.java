package com.lab;

import java.util.Scanner;
// я вариант 7 --> 2
//2.Вывести на консоль количество максимальных чисел среди этих четырех.
public class lab01_MaxNumber {
        public static int maxNbr(int[] n) {
    int max = n[0];
    for (int i = 0; i < n.length; i++) {
            if (n[i] > max) {      max = n[i];      }
        }
    return max;
}    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("1- Ввидите первое число: ");
        int n1 = Integer.parseInt(s.nextLine());
        System.out.println("2- Ввидите второе число: ");
        int n2 = Integer.parseInt(s.nextLine());
        System.out.println("3- Ввидите третья число: ");
        int n3 = Integer.parseInt(s.nextLine());
        System.out.println("4- Ввидите четвертое число: ");
        int n4 = Integer.parseInt(s.nextLine());
        s.close();
        System.out.printf("Ваши числы: \n %d \t %d \t %d \t %d", n1, n2, n3, n4);
        
        int tNumber[]={n1,n2,n3,n4 };
        int max=maxNbr(tNumber);
        System.out.println("\n Максимальное число : " + max);
        

        
    }
}
