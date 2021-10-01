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
public class KnockKnock {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        
        System.out.println("Knock Knock! Gues Who!! ");
        String nameGuess = inputReader.nextLine();
        
        if (nameGuess.equals("Marty Mcfly")){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".. from the future.");
            
   
    }else{
            System.out.println("Dude, do I -look - like " + nameGuess);
            
            }
        
        
    }
    
}
