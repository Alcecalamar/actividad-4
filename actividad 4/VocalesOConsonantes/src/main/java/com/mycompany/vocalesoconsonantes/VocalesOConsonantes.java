/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vocalesoconsonantes;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class VocalesOConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        do {
            System.out.print("Ingrese una letra: ");
            letra = scanner.next().charAt(0);

            if (Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e' || 
                Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o' || 
                Character.toLowerCase(letra) == 'u') {
                System.out.println(letra + " es una vocal.");
            } else if (Character.isLetter(letra)) {
                System.out.println(letra + " es una consonante.");
            } else if (Character.toLowerCase(letra) == ' '){
                break;
            }
            

        } while (letra != ' ');

        scanner.close();
    }
}
