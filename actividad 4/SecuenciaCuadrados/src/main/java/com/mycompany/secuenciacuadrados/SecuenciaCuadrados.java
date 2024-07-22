/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.secuenciacuadrados;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class SecuenciaCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número  positivo: ");
        int numero = scanner.nextInt();
        int contador = 1;

        do {
            System.out.println("El cuadrado de " + contador + " es " + (contador * contador));
            contador++;
        } while (contador <= numero);

        scanner.close();
    }
}
