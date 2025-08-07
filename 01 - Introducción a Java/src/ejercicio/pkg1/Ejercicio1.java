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
public class Ejercicio1 {

    final static int ANIO_ACTUAL = 2025;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int anioDeNacimiento, edad;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese su año de nacimiento: ");
        anioDeNacimiento = Integer.parseInt(input.nextLine());
        
        edad = ANIO_ACTUAL - anioDeNacimiento;
                
        System.out.println("Su edad es: " + edad );
    }
    
}
