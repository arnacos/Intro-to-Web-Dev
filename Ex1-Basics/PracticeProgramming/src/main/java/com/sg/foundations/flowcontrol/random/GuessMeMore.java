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
public class GuessMeMore {
    
    public static void main(String[] args){
        
        int myNumber = 71;
       
        
       Random randomizer = new Random();
       
       int userGuess = randomizer.nextInt(100-(-100))+(-100);
       
       System.out.println("I've chosen a number between -100 and 100. Bet "
               + "you can't guess it");
       System.out.println("Your guess: " + userGuess);
       
       if (myNumber == userGuess){
           System.out.println("Wow nice guess! That was it.");
       }
       
       if (myNumber > userGuess){
           System.out.println("Ha nice try - too low! Try Again");
         
       }
       
         if (myNumber < userGuess){
           System.out.println("Ha nice try - too high! Try Again");
          
       }
          System.out.println("Your guess: " + userGuess);
         
       
       
       
               
                
        
        
    }
    
}
