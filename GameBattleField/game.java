/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebattlefield;

import java.util.*;

/**
 *
 * @author Nemanja Djorovic
 */
public class GameBattleField {

    static double angle = 0;
    static int bulletLength = 0;
    static int rows = 22;
    static int columns = 22;

    public static void main(String[] args) {
        Scanner s_inputInt = new Scanner(System.in);

        System.out.println("Enter position Y from [1 - 20]?");
        int posX = s_inputInt.nextInt();
        System.out.println("Enter position X from [1 - 20]");
        int posY = s_inputInt.nextInt();

        int comX = (int) Math.floor(Math.random() * (rows - 2)) + 1;
        int comY = (int) Math.floor(Math.random() * (columns - 2)) + 1;

        game(posX, posY, comX, comY);

        System.out.println(" ");

//        *********************************************************************************
    }

    private static void game(int posX, int posY, int comX, int comY) {
        Scanner s_inputInt = new Scanner(System.in);

        play(posX, posY, comX, comY, angle);

        System.out.println("\nEnter angle:");
        angle = Math.toRadians(s_inputInt.nextInt());

        play(posX, posY, comX, comY, angle);

        System.out.println("Pick: \n1) Angle \n2) Exit");
        int pick = 1;

        switch (pick) {
            case 1:
                GameBattleField.game(posX, posY, comX, comY);
                break;
            case 2:
                System.out.println("EXIT");
                break;
        }

    }

    private static void play(int posX, int posY, int comX, int comY, double angle) {

        int bulletX = (int) Math.round(bulletLength * Math.cos(angle));
        int bulletY = (int) Math.round(bulletLength * Math.sin(angle));

        int grid[][] = new int[rows][columns];
        grid[posX][posY] = 1;
        grid[comX][comY] = 2;
        grid[bulletX + posX][bulletY + posY] = 3;
        
        bulletLength = 1;
        
        for (int x = 0; x < rows; x++) {
            System.out.println(" ");
            for (int y = 0; y < columns; y++) {

                if (x == 0 || x == (rows - 1) || y == 0 || y == (columns - 1)) {
                    System.out.print(grid[x][y] + " ");

                } else if (grid[posX][posY] == grid[x][y]) {
                    System.out.print("P ");

                } else if (grid[comX][comY] == grid[x][y]) {
                    System.out.print("C ");

                } else if (grid[bulletX + posX][bulletY + posY] == grid[x][y]) {
                    for (int i = 0; i < 5; i++) {
                        bulletX = (int) Math.round((bulletLength + i) * Math.cos(angle));
                        bulletY = (int) Math.round((bulletLength + i) * Math.sin(angle));

                        grid[bulletX + posX][bulletY + posY] = grid[x][y];
                    }
                    System.out.print("* ");

                } else if (grid[bulletX + posX][bulletY + posY] == grid[comX][comY]) {
                    System.out.println("X ");

                } else {
                    System.out.print("  ");

                }
            }
        }

        System.out.println("\nBullet x: " + bulletX + "\nBulet y: " + bulletY);
    }
}
