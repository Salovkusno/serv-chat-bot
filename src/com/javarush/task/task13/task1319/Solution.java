package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       String source = bufferedReader.readLine();

       StringBuilder stringBuilder = new StringBuilder();
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(source));

       String s = " ";
       while (!s.equals("exit")){
           s = bufferedReader.readLine();
           stringBuilder.append(s).append("\n");
       }
       bufferedWriter.write(stringBuilder.toString());
       bufferedWriter.close();
        // напишите тут ваш код
    }
}
