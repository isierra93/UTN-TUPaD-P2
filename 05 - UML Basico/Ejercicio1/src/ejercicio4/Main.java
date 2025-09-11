/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("BBVA", "20-33222333-7");
        Cliente cliente = new Cliente("Juan Perez", "22333444");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("3123-3213-5345-7651", "19/09/2030", banco);
        tarjeta.setCliente(cliente);
        System.out.println("Tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco:" + cliente.getTarjeta().getBanco().getNombre());

    }
    
}
