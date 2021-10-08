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
        int d1;
        int d2;
        int d3;
        int d4;
        int d5;
              
           
        //Declare and initialize scanner
        Scanner userInput = new Scanner(System.in);
        
       //Declare and initialize random
       Random numGen  = new Random();
        
        //Ask the user's pet name 
        System.out.println("What is your dog's name?");
        petName = userInput.nextLine();
        System.out.println("");
        System.out.println("Well then, I have this highly reliable report on "
        + petName + "'s prestigious background right here.");
        System.out.println("");
        System.out.println(petName + " is:");
        System.out.println("");
        
        //Get random number percentage of breed
        d1 = numGen.nextInt(20) + 1;    
        d2 = numGen.nextInt(20) + 1;
        d3 = numGen.nextInt(20) + 1;
        d4 = numGen.nextInt(20) + 1;
        d5 = 100 - (d1 + d2 + d3 + d4);
        
        //Output the background of the dog
        System.out.println(d1 + "%" + "Husky");
        System.out.println(d2 + "%" + "Bulldog");
        System.out.println(d3 + "%" + "Pitbull");
        System.out.println(d4 + "%" + "Labrador Retriever");
        System.out.println(d5 + "%" + "Rottweiler");
        
        

       }

        
        
    }
        
       

