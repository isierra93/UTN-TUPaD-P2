/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Carlos", "1144223344");
        Mesa mesa = new Mesa(8, 4);
        Reserva reserva = new Reserva("12/12/2025", "11:30", mesa);
        reserva.setCliente(cliente);
        
        System.out.println("El cliente: " + cliente.getNombre());
        System.out.println("Reservo el " + reserva.getFecha() + " la mesa: "
        + reserva.getMesa().getNumero());
    }
    
}
