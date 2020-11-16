package com.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//я вариант 7 --> 
//Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000)
//и отсортируйте массив по убыванию при помощи сортировки пузырьком.
public class lab04cours {
    
    public static void selectionSort(int[] arr){
    /*По очереди будем просматривать все подмножества
      элементов массива (0 - последний, 1-последний, 
      2-последний,...)*/
    for (int i = 0; i < arr.length; i++) {
        /*Предполагаем, что первый элемент (в каждом
           подмножестве элементов) является минимальным */
        int min = arr[i];
        int min_i = i; 
        /*В оставшейся части подмножества ищем элемент,
           который меньше предположенного минимума*/
        for (int j = i+1; j < arr.length; j++) {
            //Если находим, запоминаем его индекс
            if (arr[j] < min) {
                min = arr[j];
                min_i = j;
            }
        }
        /*Если нашелся элемент, меньший, чем на текущей позиции,
          меняем их местами*/
        if (i != min_i) {
            int tmp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = tmp;
        }
     }
}

    public static void bubbleSort(int[] arr){
    /*Внешний цикл каждый раз сокращает фрагмент массива, 
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/   
    for(int i = arr.length-1 ; i > 0 ; i--){
        for(int j = 0 ; j < i ; j++){
            /*Сравниваем элементы попарно, 
              если они имеют неправильный порядок, 
              то меняем местами*/
            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
        }
    }
}
    
    public static int[] sortArrayAlgorithm(int[] array) { //sort in descending order
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            if (array[i] >= array[j]) {
                int x = array[i];
                array[i] = array[j];
                array[j] = x;
            }
        }
    }
    return array;
}
    
    public static void main(String[] args) {
 //Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000) 
 System.out.print("\n Создайте массив из 20 случайных чисел (числа должны быть в диапазоне от 0 до 1000) \n");
int[] arr = new int[20];
for(int i = 0; i < arr.length; i++) {
    if(i%2 != 0)
    arr[i] = (int)(Math.random() * 1000);
    else
    arr[i] = (int)(Math.random() * 100);
    System.out.print(arr[i] + "  ");
}
//и отсортируйте массив по убыванию при помощи сортировки пузырьком.
System.out.print("\n отсортируйте массив по убыванию при помощи сортировки пузырьком \n");
sortArrayAlgorithm(arr);
for(int i = 0; i <  arr.length; i++) {
	System.out.print(arr[i] + "  ");
}
//*************************************************************************************
System.out.print("\nbubbleSort \n");
bubbleSort(arr);
for(int i = 0; i <  arr.length; i++) {
	System.out.print(arr[i] + "  ");
}	
//или	
System.out.print("\nselectionSort \n");
selectionSort(arr);					
for(int i = 0; i <  arr.length; i++) {
	System.out.print(arr[i] + "  ");
}	
    }
    
}
