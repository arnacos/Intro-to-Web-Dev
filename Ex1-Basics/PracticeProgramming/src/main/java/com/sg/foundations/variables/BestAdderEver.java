/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

import java.util.Scanner;

/**
 *
 * @author Arn
 */
public class BestAdderEver {
    public static void main(String[] args) {
        //Declare variables 
        int num1;
        int num2;
        int num3;
        int sum;
     
        
        //Declare string variables to hold for user's input
        String stringNum1;
        String stringNum2;
        String stringNum3;
        
        //Declare and initialize the scanner
        Scanner myScanner = new Scanner (System.in);
        
        //Get input from the user 
        System.out.println("Enter first number:");
        stringNum1 = myScanner.nextLine();
        System.out.println("Enter second number:");
        stringNum2 = myScanner.nextLine();
        System.out.println("Enter third number:");
        stringNum3 = myScanner.nextLine();
        
        //Convert string values to integer values to display
        num1 = Integer.parseInt(stringNum1);
        num2 = Integer.parseInt(stringNum2);
        num3 = Integer.parseInt(stringNum3);
        
        //Sum of 3 number 
        sum = num1 + num2 + num3;
        
        
        //Display the sum of 3 numbers
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
       
        
        
        
        
        
        
               
    }
            
}
