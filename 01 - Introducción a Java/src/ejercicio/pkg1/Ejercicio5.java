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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monto, billetes100, billetes50, billetes20, billetes10, billetes5, billetes2, resto;
        
        System.out.println("Ingrese monto en dólares: ");
        monto = input.nextInt();
        
        billetes100 = monto / 100;
        monto = monto % 100;
        
        billetes50 = monto / 50;
        monto = monto % 50;
        
        billetes20 = monto / 20;
        monto = monto % 20;
        
        billetes10 = monto / 10;
        monto = monto % 10;
        
        billetes5 = monto / 5;
        monto = monto % 5;
        
        billetes2 = monto / 2;
        monto = monto % 2;
        
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 50: " + billetes50);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 10: " + billetes10);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Billetes de 2: " + billetes2);
        System.out.println("Billetes de 1: " + monto);
    }
    
}
