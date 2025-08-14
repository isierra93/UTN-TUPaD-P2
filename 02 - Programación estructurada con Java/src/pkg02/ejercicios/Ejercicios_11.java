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
public class Ejercicios_11 {
    
    final static double DESCUENTO_GLOBAL = 0.10;
    
    /**
     11. Cálculo de descuento especial usando variable global.
    Declara una variable global Ejemplo de entrada/salida: = 0.10. Luego, crea un
    método calcularDescuentoEspecial(double precio) que use la variable global para
    calcular el descuento especial del 10%.
    Dentro del método, declara una variable local descuentoAplicado, almacena
    el valor del descuento y muestra el precio final con descuento.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioProd;
        System.out.print("Ingrese el precio del producto:");
        precioProd = Double.parseDouble(scan.nextLine());
        
        calcularDescuentoEspecial(precioProd);
        
    }
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_GLOBAL;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado );
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado) );
        
    }
    
}
