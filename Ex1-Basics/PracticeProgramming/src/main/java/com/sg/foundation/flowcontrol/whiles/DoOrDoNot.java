/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundation.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Arn
 */
public class DoOrDoNot {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;
        
        if (input.next().equals("y")){
            doIt = true;
        } else {
            doIt = false;
        }
        
        boolean iDidIt = false;
        
        do { 
            iDidIt = true;
            break;
        } while (doIt);
        
        
        if (doIt && iDidIt){
            System.out.println("I did it!");
        }else if (!doIt && iDidIt){
            System.out.println("I know you said not to ...."
                    + " but i totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anuthing!");
        }
        
    }
    
}
