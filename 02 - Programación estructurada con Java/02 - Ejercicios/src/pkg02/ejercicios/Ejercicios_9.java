/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejercicios;

import java.util.Scanner;

/**
 *
 * @author sierr
 */
public class Ejercicios_9 {

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
        Scanner scan = new Scanner(System.in);
        double precioPaq, pesoPaq, costoEnvio;
        String zonaEnv;
        
        System.out.print("Ingrese el precio del paquete: $ ");
        precioPaq = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese el peso del paquete: kg ");
        pesoPaq = Double.parseDouble(scan.nextLine());
        
        System.out.print("Ingrese la zona de envio: ");
        zonaEnv = scan.nextLine();
        
        costoEnvio = calcularCostoEnvio(pesoPaq, zonaEnv);
        System.out.println("Costo envio: $ " + costoEnvio);
        System.out.println("El total a pagar: $ " + calcularTotalCompra(precioPaq, costoEnvio));
        
    }
    
    private static double calcularCostoEnvio( double peso, String zona ){
        double costoTotal = 0;
        
        if (zona.equalsIgnoreCase("Nacional")) {
            costoTotal = peso * 5;
        } else if (zona.equalsIgnoreCase("Internacional")){
            costoTotal = peso * 10;
        }
        
        return costoTotal;
    }
    
    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
