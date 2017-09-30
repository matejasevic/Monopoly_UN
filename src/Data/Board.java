/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author Juan Ochoa
 */
public class Board {
    private static Square[][] gameBoard;

    public static Square[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(Square[][] gameBoard) {
        Board.gameBoard = gameBoard;
    }
    
    public static String generateBoard() {

        int value = 0;
        gameBoard = new Square[11][11];
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard.length; col++) {
                Square square = new Square(row, col, "Casilla ");
                gameBoard[row][col] = square;
            }
        }
        
        String printBoard = "\n";

        for (int row = 0; row < gameBoard.length; row++) {
            printBoard = printBoard.concat("\t|");
            for (int col = 0; col < gameBoard.length; col++) {
                if(row==0&&col==0)
                {
                    printBoard = printBoard.concat("|   GO   |");
                }
                else if(row==0&&col==10)
                {
                    printBoard = printBoard.concat("   JAIL  |");
                }
                else if(row==10&&col==0)
                {
                    printBoard = printBoard.concat("|GO TO JAIL|");
                }
                else if(row==10&&col==10)
                {
                    printBoard = printBoard.concat("FREE STOP|");
                }
                else if((row==0||row==10))
                {
                    printBoard = printBoard.concat(
                        gameBoard[row][col].getName().concat("|"));
                }
                else if((col==0||col==10))
                {
                    printBoard = printBoard.concat("|".concat(
                        gameBoard[row][col].getName().concat("|")));
                }
                else
                {
                    printBoard = printBoard.concat("         ");
                }
            }
            printBoard = printBoard.concat("\n");
        }
        return printBoard;
    }
}
