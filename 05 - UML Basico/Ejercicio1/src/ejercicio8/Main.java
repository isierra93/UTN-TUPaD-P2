/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Amonchi Frenzo", "Amon22@gmail.com");
        Documento documento = new Documento("Contrato alquiler", "Alquiler", "JJG87ADndnygre7", "12/12/2030", usuario);
        
        
        System.out.println("Usuario: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Documento: " + documento.getTitulo());
        System.out.println("Firma Digital: " + documento.getFirmaDigital().getFecha());
    }
    
}
