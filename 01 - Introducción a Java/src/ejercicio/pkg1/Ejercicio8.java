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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese un numero: ");
        num1 = input.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = input.nextInt();
        
        System.out.println("La division es: " + ( (double) num1/num2));
    }
    
}
