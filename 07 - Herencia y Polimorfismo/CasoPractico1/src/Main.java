
//● Clase base: Vehículo con atributos marca, modelo y metodo mostrarInfo()
//● Subclase: Auto con atributo adicional cantidadPuertas, sobrescribe
//mostrarInfo()
//● Tarea: Instanciar un auto y mostrar su información completa.

public class Main {
    public static void main(String[] args) {

    Vehiculo a = new Auto("Toyota", "Corolla", 4);
    a.mostrarInfo();

    }
}