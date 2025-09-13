/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Ipa Gonzalez", "33222444");
        CuentaBancaria cuentaBancaria = new CuentaBancaria("380129390881031029", "123456", "13/09/2025");
        cuentaBancaria.setTitular(titular);
        
        System.out.println("Cuenta: " + cuentaBancaria.getCbu());
        System.out.println("Titular: " + titular.getCuentaBancaria().getTitular().getNombre());
        System.out.println("Clave: " + cuentaBancaria.getClaveSeguridad().getCodigo());
    }
    
}
