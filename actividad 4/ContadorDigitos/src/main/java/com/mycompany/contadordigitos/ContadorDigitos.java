/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadordigitos;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int contador = 0;
        while (numero != 0) {
            numero /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
        scanner.close();
    }
}

