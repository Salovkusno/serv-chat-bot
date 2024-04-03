package com.javarush.task.pro.task18.task1805;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }


}
