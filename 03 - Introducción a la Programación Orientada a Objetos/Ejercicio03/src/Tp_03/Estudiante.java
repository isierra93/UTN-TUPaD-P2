/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp_03;

/**
 *
 * @author sierr
 */
public class Estudiante {
    private String nombre, apellido, curso;
    private double calificacion = 0;

    public double getCalificacion() {
        return calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }
    
    public String mostrarInfo(){
        String info = this.getNombre() + " " + this.getApellido() + " Curso: " + this.getCurso()
                + " Calificacion: " + this.calificacion;
        return info;
    }
    
    public void subirCalificacion (double puntos){
        if (puntos > 0) {
            this.calificacion += puntos;
        }
    }
    
    public void bajarCalificacion(double puntos){
        if (this.calificacion - puntos >= 0) {
            this.calificacion -= puntos;
        }
    }
    
    
}
