/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author darui
 */
public class MonopolyConsole implements ui {

    private int option;
    /**
     * Window welcome for monopoly console
     */
    @Override
    public void welcome() {
        System.out.println("Welcome to Monopoly! \n1. New Game\n2. Exit"); 
        this.setOption(reader.nextInt());
    }

    @Override
    public void options() {
        
        
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }
    
    
    
}
