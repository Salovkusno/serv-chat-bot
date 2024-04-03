package com.javarush.task.pro.task18.task1803;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor> {

    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2){

        return mentor1.getName().length() - mentor2.getName().length();

        //Collections.sort(ArrayList<JavaRushMentor>, Comparator<JavaRushMentor>)
    }//напишите тут ваш код
}
