/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejercicios;

/**
 *
 * @author sierr
 */
public class Ejercicios_13 {

    /**
     * 13. Impresión recursiva de arrays antes y después de modificar un elemento.
    Crea un programa que:
    a. Declare e inicialice un array con los precios de algunos productos.
    b. Use una función recursiva para mostrar los precios originales.
    c. Modifique el precio de un producto específico.
    d. Use otra función recursiva para mostrar los valores modificados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = new double[5];
        precios[0] = 199.99;
        precios[1] = 299.5;
        precios[2] = 149.75;
        precios[3] = 399;
        precios[4] = 89.99;
        
        System.out.println("Precios originales:");
        mostrarPreciosRecur(precios, 0 );
        
        precios[4] = 5;
        
        System.out.println("Precios modificados:");
        mostrarPreciosRecur(precios, 0 );
    }
    
    public static void mostrarPreciosRecur (double[] data, int index) {
        if (index == data.length) {
            return;
        }
        System.out.println(data[index]);
        mostrarPreciosRecur(data, index + 1);
        
    }
    
    
}
