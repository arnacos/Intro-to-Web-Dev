/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Arn
 */
public class HighRoller {
    
    public static void main(String[] args){
        
        // do while
        do{
            
        
            // set
            // int userScore = 0
            // int computerScore = 0;

            // get rounds from user

            // loop based on rounds
                // show round 1 of x
                // get r p s from user
                int user = 1;
                // random r p s for computer
                int computer = 2;

                // evluate user vs computer

                // display win / loose

                // update rounds
                // computerScore++; / userScore++

            // dispay over all
            
            // ask user to play again?
            // break if user wants to exit
            break;
            
        }while(true);
            
        // exit
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(6) + 1;
        
        System.out.println("TIME TO ROLL THE DICE!");
        System.out.println("I rolled a " + rollResult + ".");
        
        if (rollResult == 1){
            System.out.println("You rolled a critical failure. OUCH!");
            
        }
        
        if (rollResult ==6){
            System.out.println("You rolled a critical! NIce job!");
        }
        
        
    }
}
