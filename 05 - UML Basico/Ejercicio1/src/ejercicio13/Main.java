/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Alberto", "Alberto@gmail.com");
        GeneradorQR generadorQR = new GeneradorQR();
        
        generadorQR.generar("albertoblog", usuario);
    }
    
}
