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
public class Ejercicios_6 {

    /**
     * 6. Contador de Positivos, Negativos y Ceros (for).
    Escribe un programa que pida al usuario ingresar 10 números enteros y
    cuente cuántos son positivos, negativos y cuántos son ceros.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero; 
        int positivos = 0;
        int negativos = 0; 
        int ceros = 0;
        
        
        for (int i = 1; i < 11; i++) {
        System.out.print("Ingrese numero " + i + " : ");
        numero = scan.nextInt();

        if (numero > 0) {
            positivos = positivos + 1;
        } else if (numero < 0) {
            negativos = negativos + 1;
        } else {
            ceros = ceros + 1;
        }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
