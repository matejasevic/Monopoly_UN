/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import Data.PropertyCard;
/**
 *
 * @author Juan Ochoa
 */
public class Board {
    private static Square[][] gameBoard;
    private ArrayList<PropertyCard> cards = new ArrayList<>();
    
    public Board() {
        PropertyCard bogota = new PropertyCard(3500,"Bogotá");
        PropertyCard cartagena = new PropertyCard(3400,"Cartagena");
        PropertyCard tayrona = new PropertyCard(3300,"Parque Tayrona");
        PropertyCard medellin = new PropertyCard(3200,"Cartagena");
        PropertyCard santaMarta = new PropertyCard(3100,"Cartagena");
        PropertyCard sanAndres = new PropertyCard(3000,"Cartagena");
        PropertyCard cali = new PropertyCard(2999,"Cartagena");
        PropertyCard guatape = new PropertyCard(2900,"Cartagena");
        PropertyCard barranquilla = new PropertyCard(2800,"Cartagena");
        PropertyCard salento = new PropertyCard(2700,"Cartagena");
        PropertyCard villaLeyva = new PropertyCard(2600,"Cartagena");
        PropertyCard taganga = new PropertyCard(2500,"Cartagena");
        PropertyCard popayan = new PropertyCard(2400,"Cartagena");
        PropertyCard manizales = new PropertyCard(2300,"Cartagena");
        PropertyCard sanAgustin = new PropertyCard(2200,"Cartagena");
        PropertyCard chicamocha = new PropertyCard(2100,"Cartagena");
        PropertyCard pereira = new PropertyCard(2000,"Cartagena");
        PropertyCard bucaramanga = new PropertyCard(1900,"Cartagena");
        PropertyCard sanGil = new PropertyCard(1800,"Cartagena");
        PropertyCard leticia = new PropertyCard(2350,"Cartagena");
        PropertyCard armenia = new PropertyCard(2350,"Cartagena");
        PropertyCard chiquinquira = new PropertyCard(2350,"Cartagena");
        PropertyCard zipaquira = new PropertyCard(2350,"Cartagena");
        PropertyCard barichara = new PropertyCard(2350,"Cartagena");
        PropertyCard losNevados = new PropertyCard(2350,"Cartagena");
        PropertyCard pasto = new PropertyCard(2350,"Cartagena");
        PropertyCard rioHacha = new PropertyCard(2350,"Cartagena");
        PropertyCard ipiales = new PropertyCard(2350,"Cartagena");
        
        
        cards.add();
        int value = 0;
        gameBoard = new Square[11][11];
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard.length; col++) {
                PropertySquare square = new PropertySquare(row, col, "");
                gameBoard[row][col] = square;
            }
        }
    }

    public static Square[][] getGameBoard() {
        return gameBoard;
    }

    public static void setGameBoard(Square[][] gameBoard) {
        Board.gameBoard = gameBoard;
    }
    
    public String printBoard(String player, int r, int c) 
    {
        String printBoard = "\n";

        for (int row = 0; row < 11; row++) {
            printBoard = printBoard.concat("\t|");
            for (int col = 0; col < 11; col++) {
                
                if(row==r && col==c)
                {
                    printBoard = printBoard.concat("|"+player+"|");
                }
                else if(row==0&&col==0)
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
