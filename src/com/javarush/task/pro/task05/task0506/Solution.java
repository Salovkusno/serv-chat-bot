package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        array = new int[num];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
        //напишите тут ваш код
    }
}
