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
public class Ejercicios7 {

    /**
     * 7. Validación de Nota entre 0 y 10 (do-while).
    Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
    usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
    hasta que ingrese un valor válido.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        
        do {            
            System.out.print("Ingrese una nota entre 0 y 10: ");
            numero = scan.nextInt();   
        } while (numero < 0 || numero > 10);
        System.out.println("Nota aceptada: " + numero);
    }
    
}
