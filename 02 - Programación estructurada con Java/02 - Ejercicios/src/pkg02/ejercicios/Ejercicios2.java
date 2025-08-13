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
public class Ejercicios2 {

    /**
     * 2. Determinar el Mayor de Tres Números.
    Escribe un programa en Java que pida al usuario tres números enteros y
    determine cuál es el mayor.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Ingrese numero 1: ");
        num1 = scan.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = scan.nextInt();
        System.out.println("Ingrese numero 3: ");
        num3 = scan.nextInt();
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es el numero 1: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es el numero 2: " + num2);
        } else {
            System.out.println("El amyor es el numero 3: " + num3);
        }
    }
}
