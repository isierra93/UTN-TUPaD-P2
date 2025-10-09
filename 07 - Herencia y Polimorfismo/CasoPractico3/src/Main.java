//● Clase abstracta: Empleado con metodo calcularSueldo()
//● Subclases: EmpleadoPlanta, EmpleadoTemporal
//● Tarea: Crear lista de empleados, invocar calcularSueldo() polimórficamente,
//usar instanceof para clasificar

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>(Arrays.asList(
                new EmpleadoPlanta("1", "Pablo Gemini", 120000),
                new EmpleadoPlanta("2", "Maria Salvio", 134000),
                new EmpleadoTemporal("3", "Viviana Gomez", 100000)
        ));

        for (Empleado f : listaEmpleados) {
            System.out.println("Empleado: " + f.getNombreCompleto() +
                    " Salario: " + f.calcularSueldo() +
                    " Tipo: " + (f instanceof EmpleadoPlanta ? "Planta" : "Temporal"));
        }

    }
}