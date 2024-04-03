package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try (FileInputStream fileInputStream = new FileInputStream(path)){
            InputStreamReader reader = new InputStreamReader(fileInputStream);
            BufferedReader br = new BufferedReader(reader);
            br.lines()
                    .map(Integer::parseInt)
                    .filter(x -> x%2==0)
                    .sorted()
                    .forEach(System.out::println);// напишите тут ваш код
        }

    }
}
