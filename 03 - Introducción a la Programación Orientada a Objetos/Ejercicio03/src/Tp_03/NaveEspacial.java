/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tp_03;

/**
 *
 * @author sierr
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;

    private String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int getCombustible() {
        return combustible;
    }

    private void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar() {
        System.out.println("La nave despego..");
    }
    
    public void avanzar(int distancia) {
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println("El combustible alcanza, se avanzo: " + distancia);
        } else {
            System.out.println("El combustible no alcanza falta: " + (distancia - this.combustible
                    + " litros de combustibe"));
        }
    }
    
    public void recargarCombustible(int cantidad) { 
        if (cantidad > 0) {
            this.setCombustible(this.combustible + cantidad);
        }
    }
    
    public void mostrarEstado() {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Combustible: " + this.getCombustible());
    }
}
