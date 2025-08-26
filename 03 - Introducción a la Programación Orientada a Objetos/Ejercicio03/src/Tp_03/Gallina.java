/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp_03;

/**
 *
 * @author sierr
 */
public class Gallina {
    private int idGallina, edad = 0, huevosPuestos = 0;

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    private void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo() {
        this.setHuevosPuestos(this.huevosPuestos+1);
    }
    
    public void envejecer() {
        this.setEdad(this.edad+1);
    }
    
    public void mostrarEstado() {
        System.out.println("ID: " + this.idGallina);
        System.out.println("Edad: " + this.edad);
        System.out.println("Huevos puestos: " + this.huevosPuestos);
    }
}
