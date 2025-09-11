/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author sierr
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria bateria = new Bateria("AXFHT312", 3600);
        Celular celular = new Celular("01983291329", "Xiaomi", "Redmi Note", bateria);
        Usuario usuario = new Usuario("Champi", "22333222");
        usuario.setCelular(celular);
        
        System.out.println("El usuario: " + usuario.getNombre() + " tiene el celular "
        + celular.getMarca() + " " + usuario.getCelular().getModelo());
        System.out.println("Bateria: " + celular.getBateria().getModelo());
    }
    
}
