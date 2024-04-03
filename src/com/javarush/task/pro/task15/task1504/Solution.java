package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/* 
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in); 
       var inputStream = Files.newInputStream(Paths.get(scanner.nextLine())); var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine())))
       {
       
        byte[] in = inputStream.readAllBytes();
        byte[] out = new byte[in.length];
        for (int i = 0; i < in.length ; i = i + 2){
            if(i < in.length - 1){
                out[i] = in[i + 1];
                out[i + 1] = in[i];
            }else{
                out[i] = in[i];
            }
        }
        outputStream.write(out);//напишите тут ваш код
    } catch(IOException e) {
        System.out.println("Есть ошибка " + e);
    }

    }
}

