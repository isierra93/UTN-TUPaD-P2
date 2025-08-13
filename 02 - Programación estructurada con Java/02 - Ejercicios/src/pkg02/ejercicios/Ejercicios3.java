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
public class Ejercicios3 {

    /**
     * 3. Clasificación de Edad.
        Escribe un programa en Java que solicite al usuario su edad y clasifique su
        etapa de vida según la siguiente tabla:
        Menor de 12 años: "Niño"
        Entre 12 y 17 años: "Adolescente"
        Entre 18 y 59 años: "Adulto"
        60 años o más: "Adulto mayor"
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Ingrese su edad: ");
       int edad = scan.nextInt();
      
        if (edad < 12) {
            System.out.println("Niño.");
        }else if (edad >= 12 && edad <= 17){
            System.out.println("Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Adulto Mayor.");
        }
    }
    
}
