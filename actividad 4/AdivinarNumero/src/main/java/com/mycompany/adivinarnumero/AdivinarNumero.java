/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarnumero;

/**
 *
 * @author cabal
 */
import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intento;

        System.out.println("Adivina el número entre 1 y 100");

        do {
            System.out.print("Ingresa tu suposición: ");
            intento = scanner.nextInt();

            if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo!");
            } else if (intento > numeroAdivinar) {
                System.out.println("Demasiado alto!");
                if (numeroAdivinar%2==0){
                    System.out.print("pista el nuemro es par ");}
                else{
                    System.out.print("pista el numero es impar ");}
            } else {
                System.out.println("Correcto! El número era " + numeroAdivinar);
            }
        } while (intento != numeroAdivinar);

        scanner.close();
    }
}
