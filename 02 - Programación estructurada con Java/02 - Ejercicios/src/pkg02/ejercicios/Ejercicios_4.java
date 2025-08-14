/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author sierr
 */
public class Ejercicios_4 {

    /**
     * 4. Calculadora de Descuento según categoría.
    Escribe un programa que solicite al usuario el precio de un producto y
    su categoría (A, B o C).
    Luego, aplique los siguientes descuentos:
    Categoría A: 10% de descuento
    Categoría B: 15% de descuento
    Categoría C: 20% de descuento
    El programa debe mostrar el precio original, el descuento aplicado y el
    precio final
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioFinal, descuento;
        System.out.print("Ingrese un precio: ");
        double precio = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese una categoría (A, B o C) :");
        char cat = scan.nextLine().charAt(0);
        
        switch (cat) {
            case 'A':
                precioFinal = precio - (precio * 0.10);
                descuento = precio * 0.10;
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento: " + descuento);
                System.out.println("Precio final: " + precioFinal);
                break;
            case 'B':
                precioFinal = precio - (precio * 0.15);
                descuento = precio * 0.15;
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento: " + descuento);
                System.out.println("Precio final: " + precioFinal);
                break;
            case 'C':
                precioFinal = precio - (precio * 0.20);
                descuento = precio * 0.20;
                System.out.println("Precio original: " + precio);
                System.out.println("Descuento: " + descuento);
                System.out.println("Precio final: " + precioFinal);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
