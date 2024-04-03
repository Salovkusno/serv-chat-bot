package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int [] array = new int[num];
        if (num > 0){
            for (int i = 0; i < (array.length + 1); i++){
                if (i < array.length){
                    array[i] = scanner.nextInt();
                    continue;//напишите тут ваш код
                }if (num % 2 == 0){
                    for (int a = (array.length -1); a >= 0; a--){
                        System.out.println(array[a]);
                    }
                }else {
                    for (int b = 0; b < array.length; b++){
                        System.out.println(array[b]);
                    }
                }
            }
        }
    }
}
