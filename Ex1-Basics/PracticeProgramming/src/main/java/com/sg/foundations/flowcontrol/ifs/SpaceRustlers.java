/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

/**
 *
 * @author Arn
 */
public class SpaceRustlers {
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if (aliens > spaceships) {
            System.out.println("Vroom, vroom! Let's get going!");
        } else{
            System.out.println("There aren't enough green guys to drive "
                    + "these ships");
        }
        
        if (cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for "
                    + "all these walking hamburgers!");
        }else if (cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to f "
                    + "it all these cows in here");
                             
        } else{ 
            System.out.println("Too many ships! Not enough cows.");
        }
    }
}
