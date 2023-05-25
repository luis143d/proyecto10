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
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int contador = 0;
        
        do {
            contador++;
            numero /= 10;
        } while (numero != 0);
        
        System.out.println("Cantidad de dígitos: " + contador);
        
        scanner.close();
    }
}
