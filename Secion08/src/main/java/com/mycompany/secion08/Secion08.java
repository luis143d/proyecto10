/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.secion08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Secion08 {
    public static void main(String[] args) {
        // Definir el mapa de productos con sus tipos y precios
        Map<String, Producto> productos = new HashMap<>();

        // Solicitar al usuario ingresar los precios y tipos de los productos
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el precio del Producto" + i + ": ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese el tipo del Producto" + i + ": ");
            String tipo = scanner.next();
            scanner.nextLine();

            productos.put("Producto" + i, new Producto(tipo, precio));
        }

        // Calcular el valor de la venta
        double total = calcularValorVenta(productos);
        System.out.println("Valor de la venta: $" + total);
    }

    public static double calcularValorVenta(Map<String, Producto> productos) {
        double total = 0;

        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto producto = entry.getValue();
            double precio = producto.getPrecio();
            String tipo = producto.getTipo();

            double descuento = 0;

            if (tipo.equals("A")) {
                descuento = precio * 0.15;
            } else if (tipo.equals("B")) {
                descuento = precio * 0.20;
            }

            total += precio - descuento;
        }

        return total;
    }

    static class Producto {
        private String tipo;
        private double precio;

        public Producto(String tipo, double precio) {
            this.tipo = tipo;
            this.precio = precio;
        }

        public String getTipo() {
            return tipo;
        }

        public double getPrecio() {
            return precio;
        }
    }
}
