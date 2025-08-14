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
public class Ejercicios_5 {

    /**
     * 5. Suma de Números Pares (while).
    Escribe un programa que solicite números al usuario y sume solo los
    números pares. El ciclo debe continuar hasta que el usuario ingrese el número
    0, momento en el que se debe mostrar la suma total de los pares ingresados.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sumaTotal, numero;
        sumaTotal = 0;
        
        do {                
            System.out.print("Ingrese un número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) {
                sumaTotal += numero;
            }
            } while (numero != 0);
        
        System.out.println("La suma total es: " + sumaTotal);
    }
    
}
