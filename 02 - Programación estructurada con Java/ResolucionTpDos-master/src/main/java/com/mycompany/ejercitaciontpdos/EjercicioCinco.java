package com.mycompany.ejercitaciontpdos;

public class EjercicioCinco {

    public static void main(String[] args) {
        int contador =1;
        
        while (contador <= 3) {            
            System.out.println("Conteo externo: " + contador);
            for (int i = 1; i <= 4; i++) {
                System.out.println("Conteo interno: " + i);
            }
            contador++;
        }
        
    }
    
}
