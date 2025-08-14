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
public class Ejercicios_10 {

    /**
     * 10. Actualización de stock a partir de venta y recepción de productos.
    Crea un método actualizarStock(int stockActual, int cantidadVendida,
    int cantidadRecibida), que calcule el nuevo stock después de una venta y
    recepción
    de productos:
    NuevoStock = StockActual − CantidadVendida + CantidadRecibida
    NuevoStock = CantidadVendida + CantidadRecibida
    Desde main(), solicita al usuario el stock actual, la cantidad vendida y la
    cantidad recibida, y muestra el stock actualizado.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int stock, cantVend, cantRecib;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual: ");
        stock = Integer.parseInt(scan.nextLine());
        
        System.out.print("Ingrese la cantidad vendida: ");
        cantVend = Integer.parseInt(scan.nextLine());
        
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecib = Integer.parseInt(scan.nextLine());
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stock, cantVend, cantRecib));
        
    }
    
    public static int actualizarStock (int stockActual, int cantidadVendida, int cantidadRecibida){
        int NuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return NuevoStock;
    }
}
