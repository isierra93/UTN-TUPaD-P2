/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author sierr
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Nuevo Encuentro", "Av Falsa 321");
        Libro libro = new Libro("Cadaver exiquisito", "NDAS78DNDAS", editorial);
        Autor autor = new Autor("Agustina Bazterrica", "Argentina");
        libro.setAutor(autor);
        
        System.out.println("Libro : " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());
        
    }
    
}
