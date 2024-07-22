/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteonumeros;

/**
 *
 * @author cabal
 */
import java.util.Scanner;

public class ConteoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad de numeros ");
        int cantidad = scanner.nextInt();

        int mayores = 0, menores = 0, iguales = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayores++;
            } else if (numero < 0) {
                menores++;
            } else {
                iguales++;
            }
        }

        System.out.println("Mayores que 0: " + mayores);
        System.out.println("Menores que 0: " + menores);
        System.out.println("Iguales a 0: " + iguales);

        scanner.close();
    }
}

