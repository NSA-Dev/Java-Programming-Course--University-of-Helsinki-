/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author Nikita
 */
public class Game {

    private int[][] field;
    private int currentPlayer; // 1 - X, 2 - 0

    public Game() {
        field = new int[3][3];
        currentPlayer = 1;
    }

    public boolean claimCell(int x, int y) {
        if (currentPlayer == 3) {
            return false;
        }
        if (field[x][y] == 0) {
            field[x][y] = currentPlayer;
            return true;
        }
        return false;

    }

    // switching handled by the UI
    public void switchPlayer() {
        if (currentPlayer >= 2) {
            currentPlayer = 1;
        } else {
            currentPlayer = 2;
        }
    }

    private boolean checkVictoryHor() {

        for (int i = 0; i < 3; i++) {
            int match = 0;
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == currentPlayer) {
                    match++;
                }
            }
            if (match == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean checkVictoryVert() {

        for (int i = 0; i < 3; i++) {
            int match = 0;
            for (int j = 0; j < 3; j++) {
                if (field[j][i] == currentPlayer) {
                    match++;
                }
            }
            if (match == 3) {
                return true;
            }
        }

        return false;
    }

    private boolean checkVictoryLeftDiag() {
        int match = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][i] == currentPlayer) {
                match++;
            }
        }        
        return match == 3;
    }

    private boolean checkVictoryRightDiag() {
        int match = 0;
        for (int i = 0; i < 3; i++) {
            if (field[i][2 - i] == currentPlayer) {
                match++;
            }
        }
        return match == 3; 
    }

    public boolean checkVictoryCondition() {
        if (checkVictoryHor()) {
            return true;
        } else if (checkVictoryVert()) {
            return true;
        } else if (checkVictoryLeftDiag()) {
            return true;
        } else if (checkVictoryRightDiag()) {
            return true;
        }
        return false;
    }

    public char getPlayerSign() {
        if (currentPlayer == 1) {
            return 'X';
        } else {
            return 'O';
        }
    }

    public void terminateGame() {
        currentPlayer = 3;
    }

}
