/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg02.ejercicios;

/**
 *
 * @author sierr
 */
public class Ejercicios_12 {

    /**
     * 12. Modificación de un array de precios y visualización de resultados.
    Crea un programa que:
    a. Declare e inicialice un array con los precios de algunos productos.
    b. Muestre los valores originales de los precios.
    c. Modifique el precio de un producto específico.
    d. Muestre los valores modificados
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double []precios = {200.50, 193.25, 53.50, 100};
        
        System.out.println("Precios: originales:");
        for (int i = 0; i < precios.length ; i++) {
            System.out.println(precios[i]);
        }
        
        precios[0] = 400;
        precios[1] *= 2;
        precios[2] *= 3;
        precios[3] += 100;
        
        System.out.println("Precios modificados:");
        for (int i = 0; i < precios.length ; i++) {
            System.out.println(precios[i]);
        }
    }
    
}
