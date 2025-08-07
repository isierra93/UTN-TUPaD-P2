/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author sierr
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        System.out.println("Suma: " + (num1+num2));
        System.out.println("Resta: " + (num1-num2));
        System.out.println("Multiplicación: " + num1 * num2);
        System.out.println("División: " + ( (double) num1/num2));
        
    }
    
}
