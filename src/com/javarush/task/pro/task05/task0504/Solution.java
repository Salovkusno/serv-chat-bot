package com.javarush.task.pro.task05.task0504;

/* 
Объединяем массивы
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int [firstArray.length + secondArray.length];
        int d = 0;//напишите тут ваш код
        for (int a = 0; a < firstArray.length; a++, d++){
            resultArray[d] = firstArray[a];
        }
        for (int b = 0; b < secondArray.length; b++, d++){
            resultArray[d] = secondArray[b];
        }
        for (int i = 0; i < resultArray.length; i++) {
            
            System.out.print(resultArray[i] + ", ");
        }
    }
}
