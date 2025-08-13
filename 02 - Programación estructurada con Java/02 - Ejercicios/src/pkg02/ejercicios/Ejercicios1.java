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
public class Ejercicios1 {

    /**
     * 1. Verificación de Año Bisiesto.
        Escribe un programa en Java que solicite al usuario un año y determine si es
        bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
        divisible por 400.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anio;
        boolean esBiciesto;
        
        System.out.println("Ingrese un año: ");
        anio = scan.nextInt();
        esBiciesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0);
        if (esBiciesto) {
            System.out.println("Es bisiesto.");
        } else {
            System.out.println("No es bisiesto.");
        }
        
    }
    
}
