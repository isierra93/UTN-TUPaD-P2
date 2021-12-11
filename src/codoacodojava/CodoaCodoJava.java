/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codoacodojava;

import java.util.Scanner;

/**
 *
 * @author sierr
 */
public class CodoaCodoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, hobbie,editor, sistemaOperativo;
        int edad;
        
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.next();
        
        System.out.println("Ingrese su hobbie: ");
        hobbie = entrada.next();
        
        System.out.println("Ingrese su editor favorito: ");
        editor = entrada.next();
        
        System.out.println("Ingrese su sistema operativo: ");
        sistemaOperativo = entrada.next();
        
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        
        System.out.println("");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Su hobbie es: " + hobbie);
        System.out.println("Su editor favorito es: " + editor);
        System.out.println("Su sistema operativo es: " + sistemaOperativo);
        System.out.println("Su edad es: " + edad +" años.");
    }
    
}
