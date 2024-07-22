/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contadornumerosimpares;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class ContadorNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número positivo: ");
        int numero = scanner.nextInt();
        int contador = 1;

        do {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        } while (contador <= numero);

        scanner.close();
    }
}

