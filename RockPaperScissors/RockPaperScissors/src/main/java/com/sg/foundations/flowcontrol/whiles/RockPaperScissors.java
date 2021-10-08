/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 * Name: Arn Acosta
 * Date Created: 09/30/2021
 * Last Revision: if/else statement for playing rock, paper, and scissors
 * 
 */
public class RockPaperScissors {
    
    public static void main(String[] args){
        //Declare and initialize random and scanner function
       Random randNum = new Random();
       Scanner userInput = new Scanner(System.in);
       
       
       
       //Set variables
       final int ROCK = 1;
       final int PAPER = 2;
       final int SCISSORS = 3;
       
       int numOfRnds;
       int userChoice;
       int compChoice;      
       String playAgain;
       
       
       
        
       do {         
       
         //Ask the user how many 
         //round/s he/she wants to play
        System.out.println("How many rounds do you want to play?");
        numOfRnds = userInput.nextInt(); 
        
       
        //Check if the user entered a valid range 
        if (numOfRnds<1) {
            System.out.println("Error! Min. 1 round is required");
        } else if (numOfRnds>10) {
            System.out.println("Error! Max. 10 rounds");
        }
        
        
        //Play the game and record who wins per round
        int counter = 1;
        int compScore = 0;
        int userScore = 0;
        int tieGame = 0;
        while(counter <= numOfRnds && numOfRnds<11) {
            //Loop based on number of rounds entered
            counter++;
            
            do {
            //Ask user choice to start the game
            System.out.println("1: Rock; 2:Paper; 3:Scissors");
            userChoice = userInput.nextInt();            
            } while(userChoice != 1 && userChoice != 2 && userChoice != 3);
            
            //Computer enter choice
            compChoice = randNum.nextInt(3)+1;
           if (counter == 1) {
               compScore = 0;
               userScore = 0;
               tieGame = 1;
           }


            //Set conditions to evalute result and keep track of score
            //If both player select tha same thing 
            if (userChoice == compChoice) {
                System.out.println("Computer selects " + compChoice + ". " +
                        "It's a tie game.");
                tieGame++;
                System.out.println("Player: " + userScore);
                System.out.println("Computer: " + compScore);
                System.out.println("Tie: " + tieGame);

            }


            //Conditions and results when the user selects ROCK 
            else if(userChoice == 1){
                if (compChoice == 2) {
                    System.out.println("Computer selects Paper");
                    compScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);

                }
                else if (compChoice == 3) {
                    System.out.println("Computer selects Scissors");
                    userScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);
                }

            }

            //Conditions and results when the user selects Paper
            else if(userChoice == 2){
                  if (compChoice == 1) {
                    System.out.println("Computer selects Rock");
                    userScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);

                }
                else if (compChoice == 3) {
                    System.out.println("Computer selects Scissors");
                    compScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);
                }

            }

            //Conditions and results when the user selects Scissors
            else if(userChoice == 3){
                  if (compChoice == 1) {
                    System.out.println("Computer selects Rock");
                    compScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);

                }
                else if (compChoice == 2) {
                    System.out.println("Computer selects Paper");
                    userScore++;
                    System.out.println("Player: " + userScore);
                    System.out.println("Computer: " + compScore);
                    System.out.println("Tie: " + tieGame);
                }


            }     
              
                      
        }
                 
                 
        //Display overall winner
        if (userScore > compScore) {
            System.out.print("Player Wins!!!");
        }else if (compScore > userScore) {
            System.out.println("Computer wins!!!");
        }else if (userScore == compScore) {
            System.out.println("It's a Tie!!");
        }

        //Ask user to play again?
        System.out.println("Play Again? (y/n)");
       userInput = new Scanner(System.in);
       playAgain = userInput.nextLine();
       if (playAgain.equals("n")) {
           
           break;
       }      
       
         
        } while(true); 
                 
                 
        System.out.println("Thank You For Playing!!!");
              
            
                    
     
    }
        
    
    
}
