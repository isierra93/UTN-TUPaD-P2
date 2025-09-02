/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

/**
 *
 * @author sierr
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ver hashcode e equals
        Empleado a1 = new Empleado("Javier", "Front-End");
        Empleado a2 = new Empleado(3322, "Elizabeth", "Data Analist", 1200000);

        a1.actualizarSalario(111);
        a2.actualizarSalario(5.0);
        
        System.out.println(a1);
        System.out.println(a2);
        
        System.out.println(Empleado.mostrarTotalEmpleados());;
    }
    
}
