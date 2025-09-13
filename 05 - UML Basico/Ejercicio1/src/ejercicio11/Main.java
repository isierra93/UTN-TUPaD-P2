/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista artista = new Artista("Rufus", "Deep House");
        Cancion cancion = new Cancion("In the Moment");
        cancion.setArtista(artista);
        Reproductor reproductor = new Reproductor();
        reproductor.reproducir(cancion);
        
        
        
    }
    
}
