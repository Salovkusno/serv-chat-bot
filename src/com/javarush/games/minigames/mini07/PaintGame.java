package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Работа с мышью
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5,5);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                setCellColor(i, j, Color.WHITE);
            }
        }//напишите тут ваш код
    }

    @Override
    public void onMouseLeftClick(int i, int j){
        setCellColor(i, j, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int i, int j){
        setCellColor(i, j, Color.ORANGE);
    }

    //напишите тут ваш код
}
