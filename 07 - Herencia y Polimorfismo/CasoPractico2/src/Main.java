import java.util.ArrayList;
import java.util.Arrays;

//Figuras geométricas y métodos abstractos
//● Clase abstracta: Figura con metodo calcularArea() y atributo nombre
//● Subclases: Círculo y Rectángulo implementan el cálculo del área
//● Tarea: Crear un array de figuras y mostrar el área de cada una usando
//polimorfismo.

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList<>(Arrays.asList(
                new Rectangulo("Rectangulo 1", 5, 2),
                new Rectangulo("Rectangulo 2", 17.5, 8.5),
                new Rectangulo("Rectangulo 3", 22.5, 5),
                new Circulo("Circulo 1", 2.3),
                new Circulo("Circulo 2", 9),
                new Circulo("Circulo 3", 7.5)
        ));

        for (Figura f : listaFiguras) {
            String info = "Figura: " + f.getNombre() + ", Area: " + f.calcularArea();
            System.out.println(info);
        }

    }
}