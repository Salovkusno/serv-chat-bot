package com.javarush.task.pro.task04.task0424;

import java.util.Scanner;

/* 
Бомба в ядре планеты
*/

public class Solution {
    public static void main(String[] args) {
        Scanner bombInterface = new Scanner(System.in);
        
        int s;
        do {
            s = bombInterface.nextInt();
            System.out.println(s);
        }while (!(s%10 == 0));//напишите тут ваш код
    }
}
