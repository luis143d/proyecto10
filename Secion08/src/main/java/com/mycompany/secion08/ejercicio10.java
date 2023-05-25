/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secion08;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class ejercicio10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int suma = 0;

        do {
            System.out.print("Ingrese un número positivo (ingrese un número negativo para finalizar): ");
            numero = scanner.nextInt();

            if (numero > 0) {
                suma += numero;
            }
        } while (numero > 0);

        System.out.println("La suma de los números positivos ingresados es: " + suma);

        scanner.close();
    }
}
