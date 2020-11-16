
package com.lab;

public class lab05 {
//2.Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99.
//Выполните по отдельности сначала сложение, потом умножения матриц друг на друга.
//Выведете исходные матрицы и результат вычислений на консоль.    
    public static void main(String[] args) {
        int[][] matrixC = new int[3][3];
        int[][] matrixD = new int[3][3];
 //2.Даны матрицы С и D размерностью 3 на 3 и заполненные случайными числами в диапазоне  от 0 до 99.       
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = (int)(Math.random() * 100);
                matrixD[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Matrix C");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrixC[i][j] + "\t");
                }
                System.out.println();
            }
      System.out.println("Matrix D");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrixD[i][j] + "\t");
                }
                System.out.println();
            }
      System.out.println("Matrix D + C");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrixD[i][j]+matrixC[i][j] + "\t");
                }
                System.out.println();
            }
      System.out.println("Matrix D * C");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matrixD[i][j]*matrixC[i][j] + "\t");
                }
                System.out.println();
            }

        
        
    }   
}
