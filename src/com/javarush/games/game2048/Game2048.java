package com.javarush.games.game2048;
import com.javarush.engine.cell.*;
import com.javarush.engine.cell.Game;

public class Game2048 extends Game {

    private static final int SIDE = 4;
    private int [][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped;
    private int score = 0;


    @Override
    public void onKeyPress(Key key) {
        if(isGameStopped){
           if(key == Key.SPACE){
               isGameStopped = false;
               createGame();
               drawScene();
               score = 0;
               setScore(score);
           }else {
               return;
           }
        }

        if (!canUserMove() ){
            gameOver();
            return;
        }
        super.onKeyPress(key);
        if (key == Key.LEFT){
            moveLeft();
        }else if (key == Key.RIGHT){
            moveRight();
        }else if (key == Key.UP){
            moveUp();
        }else if (key == Key.DOWN){
            moveDown();
        }else {
            return;
        }
        drawScene();
    }

    @Override
    public void initialize(){

        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();

    }
    private void createGame(){
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
    }
    private void drawScene(){
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }
    private void createNewNumber(){
        if (getMaxTileValue() >= 2048){
            win();
            return;
        }
       boolean isCreated = false;
       do {
           int x = getRandomNumber(SIDE);
           int y = getRandomNumber(SIDE);
           if (gameField[y][x] ==0){
               gameField[y][x] = getRandomNumber(10) < 9? 2: 4;
               isCreated = true;
           }
       }
       while (!isCreated);
    }

    private void setCellColoredNumber(int x, int y, int value){
        Color color = getColorByValue(value);
        String str = value > 0? "" + value: "";
        setCellValueEx(x, y, color, str);

    }
    private void moveLeft(){
       boolean newNumber = false;
       for (int[] row : gameField){
           boolean compressed = compressRow(row);
           boolean merge = mergeRow(row);
           if (merge){
               compressRow(row);
           }else if (compressed || merge){
               newNumber = true;
           }
       }
       if (newNumber){
           createNewNumber();
       }
       drawScene();
    }
    private void moveRight(){
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }
    private void moveUp(){
       rotateClockwise();
       rotateClockwise();
       rotateClockwise();
       moveLeft();
       rotateClockwise();
    }
    private void moveDown(){
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private Color getColorByValue(int value){
        switch (value){
            case 0:
               return Color.IVORY;
            case 2:
                return Color.LAVENDER;
            case 4:
                return Color.DARKGREY;
            case 8:
                return Color.ORANGE;
            case 16:
                return Color.DARKORANGE;
            case 32:
                return Color.CORAL;
            case 64:
                return Color.CRIMSON;
            case 128:
                return Color.GOLD;
            case 256:
                return Color.GOLDENROD;
            case 512:
                return Color.DARKGOLDENROD;
            case 1024:
                return Color.SALMON;
            case 2048:
                return Color.YELLOW;
            default:
                return Color.NONE;
        }
    }
    private boolean compressRow(int[] row){
         int position = 0;
         boolean result = false;
        for (int i = 0; i < SIDE; i++) {
            if (row[i] > 0){
                if (i != position){
                    row[position] = row[i];
                    row[i] = 0;
                    result = true;
                }
                position++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[]row){
        boolean result = false;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]){
                row[i] = row[i] + row[i + 1];
                row[i + 1] = 0;
                result = true;
                score = score + row[i];
                setScore(score);
            }
        }
        return result;
    }
    private void rotateClockwise(){
        int[][] row = new int[SIDE][SIDE];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                row[j][SIDE - i - 1] = gameField[i][j];
            }
        }
        gameField = row;
    }
    private int getMaxTileValue(){
        int max = gameField[0][0];
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] > max){
                    max = gameField[i][j];
                }
            }
        }
        return max;
    }
    private void win(){
        showMessageDialog(Color.GREEN, "YOU WIN", Color.RED,25);
        isGameStopped = true;
    }
    private void gameOver(){
        showMessageDialog(Color.RED, "GAME OVER", Color.WHITE, 25);
        isGameStopped = true;
    }
    private boolean canUserMove(){
        for (int i = 0; i < SIDE; i++) {
            for (int j = 0; j < SIDE; j++) {
                if (gameField[i][j] == 0){
                    return true;
                } else if (i < SIDE - 1 && gameField[i][j] == gameField[i + 1][j]) {
                    return true;
                } else if (j < SIDE - 1 && gameField[i][j] == gameField[i][j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

}
