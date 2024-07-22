/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisiblespor3y5;

/**
 *
 * @author cabal
 */
public class DivisiblesPor3y5 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 100) { 
            if (i % 3 == 0 && i % 5 == 0) { 
                System.out.println(i);
            }
            i++; 
        }
    }
}


