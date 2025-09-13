/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Contribuyente contribuyente = new Contribuyente("Mariano Caputo", "98123739218");
        Impuesto impuesto = new Impuesto(250.50);
        impuesto.setContribuyente(contribuyente);
        
        calculadora.calcular(impuesto);
    }
    
}
