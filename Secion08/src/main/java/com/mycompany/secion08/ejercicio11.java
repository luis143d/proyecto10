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
public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String contrasena;
        
        do {
            System.out.print("Ingrese una contraseña: ");
            contrasena = scanner.nextLine();
            
            if (!esContrasenaValida(contrasena)) {
                System.out.println("La contraseña no cumple con los criterios de validación. Inténtelo nuevamente.");
            }
        } while (!esContrasenaValida(contrasena));
        
        System.out.println("Contraseña válida: " + contrasena);
        
        scanner.close();
    }
    
    public static boolean esContrasenaValida(String contrasena) {
        // Verificar si la contraseña cumple con los criterios deseados
        // Por ejemplo, la contraseña debe tener al menos 8 caracteres y contener letras y números
        
        if (contrasena.length() < 8) {
            return false;
        }
        
        boolean contieneLetras = false;
        boolean contieneNumeros = false;
        
        for (char c : contrasena.toCharArray()) {
            if (Character.isLetter(c)) {
                contieneLetras = true;
            } else if (Character.isDigit(c)) {
                contieneNumeros = true;
            }
            
            if (contieneLetras && contieneNumeros) {
                return true;
            }
        }
        
        return false;
    }
}
