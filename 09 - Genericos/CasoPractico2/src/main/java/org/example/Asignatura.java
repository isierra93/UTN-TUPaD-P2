package org.example;


public class Asignatura implements Materia, Comparable<Asignatura> {
    String codigo;
    String nombre;
    int creditos;

    public Asignatura(String codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    private String getCodigo() {
        return codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCreditos() {
        return creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", creditos=" + creditos +
                '}';
    }

    @Override
    public int compareTo(Asignatura o) {
        return codigo.compareTo(o.getCodigo());
    }
}
