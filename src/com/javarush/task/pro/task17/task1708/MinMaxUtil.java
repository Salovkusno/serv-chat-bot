package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int a, int b){

        return Math.min(a, b);
    }
    public static int min(int a, int b, int c){
        return Math.min(c , Math.min(a, b));
    }
    public static int min(int a, int b, int c, int d){
        return Math.min(d ,Math.min(c, Math.min(a, b)));
    }
    public static int min(int a, int b, int c, int d, int i){
        return Math.min(i, Math.min(d ,Math.min(c, Math.min(a, b))));
    }
    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static int max(int a, int b, int c){
        return Math.max(c , Math.max(a, b));
    }
    public static int max(int a, int b, int c, int d){
        return Math.max(d ,Math.max(c, Math.max(a, b)));
    }
    public static int max(int a, int b, int c, int d, int i){
        return Math.max(i, Math.max(d ,Math.max(c, Math.max(a, b))));
    }//напишите тут ваш код
}
