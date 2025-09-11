/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author sierr
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular t = new Titular("Marco", "332233223");
        Pasaporte p = new Pasaporte("321323", "19/09/1999", "perfil", "jpg");
        t.setPasaporte(p);
        System.out.println("Titular: " + t.getNombre());
        System.out.println("Pasaporte numero: " + p.getNumero());
        System.out.println("Foto: " + t.getPasaporte().getFoto().getImagen() + "." +
               t.getPasaporte().getFoto().getFormato() );
    }
    
}
