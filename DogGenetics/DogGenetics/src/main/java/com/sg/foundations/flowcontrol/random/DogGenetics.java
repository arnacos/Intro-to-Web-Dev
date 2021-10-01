/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *Name: Arn Acosta
 *Date Created: 09/30/2021
 * Last revision: randomize dog breed
 * 
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        //Declare variables
        String petName;
        
        //Declare and initialize scanner
        Scanner userInput = new Scanner(System.in);
        
        //Ask the user's pet name 
        System.out.println("What is your dog's name?");
        petName = userInput.nextLine();
        System.out.println("");
        System.out.println("Well then, I have this highly reliable report on "
        + petName + "'s prestigious background right here.");
        System.out.println("");
        System.out.println(petName + " is:");
        System.out.println("");
        
        // Call method to get nirandom number 
        System.out.println(randomNum(47,55) + "% " + "Rottweiler");
        System.out.println(randomNum(22,30) + "% " + "German Shepherd");
        System.out.println(randomNum(10,13) + "% " + "Husky");
        System.out.println(randomNum(5,9) + "% " + "Labrador");
        System.out.println(randomNum(1,3) + "% " + "Great Dane");
      
       }
    //Method to get the random number for the type of breed 
    public static int randomNum(int min, int max) {
        Random randGen = new Random();
        int randomNum = randGen.nextInt((max-min)+1)+min;
        return randomNum;
        
        
    }
        
    }
    

