/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor(1.6, "ASDN83712");
        Conductor conductor = new Conductor("Amon", 223);
        Vehiculo vehiculo = new Vehiculo("GFR 082", "FIAT", motor);
        conductor.setVehiculo(vehiculo);
        
        System.out.println("Conductor: " + conductor.getNombre());
        System.out.println("Vehiculo: " + vehiculo.getModelo());
        System.out.println("Motor: " + vehiculo.getMotor().getTipo());
        
    }
    
}
