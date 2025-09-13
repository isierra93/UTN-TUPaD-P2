/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author sierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesional profesional = new Profesional("Pablo Granados", "Kinesiologia");
        Paciente paciente = new Paciente("Pachu Peza", "Sancor Salud");
        CitaMedica citaMedica = new CitaMedica("12/12/2030", "10:30 AM");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        
        System.out.println("Paciente: " + citaMedica.getPaciente().getNombre());
        System.out.println("Profesional: " + citaMedica.getProfesional().getNombre());
        System.out.println("Especialidad: " + citaMedica.getProfesional().getEspecialidad());
        System.out.println("Fecha: " + citaMedica.getFecha() + "\n" +"Hora: " + citaMedica.getHora());
        
    }
    
}
