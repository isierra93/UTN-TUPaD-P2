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
public class Ejercicio4 {
    final static int CANT_PASADAS = 3;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ancho, largo, perimetro, precioM2, precioTerreno;
        
        System.out.println("Ingrese el ancho: ");
        ancho = input.nextInt();
        System.out.println("Ingrese el largo: ");
        largo = input.nextInt();
        System.out.println("Ingrese el precio del M2: ");
        precioM2 = input.nextInt();
        
        precioTerreno = (ancho*largo) * precioM2;
        perimetro = (ancho*2) + (largo * 2);
        
        System.out.println("El precio del terreno es: USD " + precioTerreno );
        System.out.println("Los metros de alambre necesarios: " + (perimetro * CANT_PASADAS) + "m.");
    }
    
}
