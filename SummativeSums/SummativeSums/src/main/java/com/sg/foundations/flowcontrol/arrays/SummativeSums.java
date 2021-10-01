/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *Name: Arn Acosta
 * Date Created: 90/30/2021
 * Last Revision: Array & method 
 * 
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
            140, 150, 160, 170, 180, 190, 200, -99};
        
        // Call the method for the array to output the sum of 3 Arrays 
        System.out.println("The sum of Array #1 is: " + sum(array1));
        System.out.println("The sum of Array #2 is: " + sum(array2));
        System.out.println("The sum of Array #3 is: " + sum(array3));
              
    }
    
    
    //Method to get sum of array 
    public static int sum(int[] x) {
        int total = 0;
        for (int i = 0; i<x.length; i++) {
            total += x[i];
        }
        return total; 
        
    }
    
}
