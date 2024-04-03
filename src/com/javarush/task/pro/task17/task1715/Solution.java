package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());

        //напишите тут ваш код
    }

    public static void createStringedOrchestra() {

        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());

        //напишите тут ваш код
    }

    public static void playOrchestra() {
        for (MusicalInstrument orchestr : orchestra){
            if (orchestr instanceof  MusicalInstrument){
                MusicalInstrument music = (MusicalInstrument) orchestr;
                music.play();//напишите тут ваш код
            }
        }
    }
}
