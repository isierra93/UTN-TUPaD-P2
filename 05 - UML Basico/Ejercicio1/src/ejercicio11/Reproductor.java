/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author sierr
 */
public class Reproductor {
    
    public static void reproducir(Cancion cancion){
        System.out.println("Sonando: " + cancion.getTitulo() + " - "
        + cancion.getArtista().getNombre());
    }
}
