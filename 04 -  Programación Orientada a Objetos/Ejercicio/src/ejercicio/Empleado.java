/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

/**
 *
 * @author sierr
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = this.hashCode();
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000000.00;
        totalEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    private void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            double nuevoSueldo = this.salario * (1 + porcentaje / 100);
            setSalario(nuevoSueldo);
        }
    }
    
    public void actualizarSalario(int cantFija) {
        if (cantFija > 0) {
            setSalario(this.salario + cantFija);
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static String mostrarTotalEmpleados() {
        return "Total empleados: " + totalEmpleados ;
    }
    
    
}
