/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Arn
 */
public class GuessMe {
    public static void main(String[] args) {
        int myNumber = 17;
        int userGuess;
        String whatNumber;
        
        //Declare and initialize the scanner 
        Scanner myScanner = new Scanner(System.in);
        
                
        //Ask user what number I'm thinking
        System.out.println("I've chosen a number. Betcha can't guess it!");
        whatNumber = myScanner.nextLine();
        
        //Convert String value to integer
        userGuess = Integer.parseInt(whatNumber);
        
        //Display user input
        System.out.println("Your guess: " + userGuess);
        
        if(userGuess==myNumber) {
            System.out.print("Wow, nice guess! That was it!");
            
            
        }
        
        if(userGuess<myNumber) {
            System.out.println("Ha, nice try - too low! I chose " + myNumber
            + ".");
        }
        
        if(userGuess>myNumber) {
            System.out.println("Too bad, way too high. I chose " + myNumber +
                    ".");
        }
        
                
    }
    
}
