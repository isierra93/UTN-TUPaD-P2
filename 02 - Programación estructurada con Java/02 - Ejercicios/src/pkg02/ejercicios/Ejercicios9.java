/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejercicios;

/**
 *
 * @author sierr
 */
public class Ejercicios9 {

    /**
    9. Composición de funciones para calcular costo de envío y total de compra.
    a. calcularCostoEnvio(double peso, String zona): Calcula el costo de
    envío basado en la zona de envío (Nacional o Internacional) y el peso del
    paquete.
    Nacional: $5 por kg
    Internacional: $10 por kg
    b. calcularTotalCompra(double precioProducto, double
    costoEnvio): Usa calcularCostoEnvio para sumar el costo del producto con
    el costo de envío.
    Desde main(), solicita el peso del paquete, la zona de envío y el precio
    del producto. Luego, muestra el total a pagar.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    private static double calcularCostoEnvio( double peso, String zona ){
        double costoTotal = 0;
        
        if (zona == "Nacional") {
            costoTotal = peso * 5;
        } else if (zona == "Internacional") {
            costoTotal = peso * 10;
        }
        
        return costoTotal;
    }
}
