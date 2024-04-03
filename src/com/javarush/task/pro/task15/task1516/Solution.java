package com.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл или директория
*/

public class Solution {
    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str1 = scanner.nextLine();
            if (str1.isEmpty()){
                break;
            }


            if (Files.isRegularFile(Path.of(str1))) {
                System.out.println(str1 + THIS_IS_FILE);
            } else if (Files.isDirectory(Path.of(str1))) {
                System.out.println(str1 + THIS_IS_DIR);
            }
             else {
                 break;

            }

        }
        //напишите тут ваш код
    }
}

