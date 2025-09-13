/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author sierr
 */
public class Calculadora {
    public static void calcular(Impuesto impuesto) {
        System.out.println("El contribuyente: " + impuesto.getContribuyente().getNombre());
        System.out.println("Abona: " + impuesto.getMonto());
    }
}
