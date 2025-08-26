/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tp_03;

/**
 *
 * @author sierr
 */
public class Tp_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Estudiante
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setApellido("Rodriguez");
        estudiante.setCurso("TUPD");
        System.out.println(estudiante.mostrarInfo());
        estudiante.subirCalificacion(5);
        estudiante.subirCalificacion(2);
        estudiante.bajarCalificacion(3);
        System.out.println(estudiante.mostrarInfo());
        
        //Mascota
        Mascota mascota = new Mascota();
        mascota.setNombre("Amon");
        mascota.setEspecie("Gato");
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        
        //Libro
        Libro libro = new Libro();
        libro.setTitulo("1984");
        libro.setAutor("George Orwell");
        libro.setAnioPublicacion(-123);
        System.out.println(libro.getAnioPublicacion());
        libro.setAnioPublicacion(1949);
        System.out.println(libro.getAnioPublicacion());
    }
    
}
