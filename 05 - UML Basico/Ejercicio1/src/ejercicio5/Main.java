/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora computadora = new Computadora("LOGITECH", "6345-132645-346534", "B-450", "AM4");
        Propietario propietario = new Propietario("Juan Carlos", "22333444");
        propietario.setComputadora(computadora);
        
        System.out.println("Computadora: " + computadora.getMarca());
        System.out.println("Placa Madre: " + computadora.getPlacaMadre().getModelo());
        System.out.println("Propietario: " + propietario.getComputadora().getMarca());
        
    }
    
}
