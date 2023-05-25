/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.secion08;

/**
 *
 * @author Murillo
 */
public class ejercicio07 {
     public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) { // Verificar si el número es par
                suma += i;
            }
            i++;
        }

        System.out.println("La suma de los números pares del 1 al 10 es: " + suma);
    }
}
