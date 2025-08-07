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
public class Ejercicio3 {
    final static double CANT_JORNADAS_TRABAJADAS = 5.5;
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double sueldoDiario, sueldoSemanal;
        
        System.out.println("Ingrese su sueldo diario: ");
        sueldoDiario = Double.parseDouble(input.nextLine());
        sueldoSemanal = sueldoDiario * CANT_JORNADAS_TRABAJADAS;
        
        System.out.println("Su sueldo semanal es : " + sueldoSemanal);
    }
    
}
