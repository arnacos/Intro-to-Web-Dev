/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *Name: Arn Acosta
 * Date Created: 09/30/2021
 * Last Revision: Ifs, operators & scanner 
 * 
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        //Declare variable for user age
        int userAge;
        int maxHR;
        int lowHR;
        int highHR;
       
        
        
        //Declare String variable to hold user age
        String stringAge;
        
        //Declare and initialize scanner 
        Scanner userInput = new Scanner(System.in);
        
        
        //Ask user for age 
        System.out.println("What is your age?");
        stringAge = userInput.nextLine();
        
        //Convert string values to integer value for user age
        userAge = Integer.parseInt(stringAge);
        
       //Output the maximum heart rate of the user 
       maxHR = 220 - userAge;//Calculate max heart rate
       System.out.println("Your maximum heart rate should be " + 
               maxHR + " beats per minute.");
       
       
       //Output the target HR Zone
       lowHR = (int) (maxHR * 0.5); //Calculate the lowHR 
       
       highHR = (int) (maxHR * 0.85);//Calculate the highHR
       
       System.out.println("Your target HR Zone is " + lowHR + " - "
       + highHR + " beats per minute.");
        
           
        
        
    
}
    
}
