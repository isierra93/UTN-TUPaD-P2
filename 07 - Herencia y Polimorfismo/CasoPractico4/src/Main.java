//● Clase: Animal con metodo hacerSonido() y describirAnimal()
//● Subclases: Perro, Gato, Vaca sobrescriben hacerSonido() con @Override
//● Tarea: Crear lista de animales y mostrar sus sonidos con polimorfismo

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> listaAnimales = new ArrayList<>();
        Animal a1 = new Gato(2);
        Animal a2 = new Vaca(6);
        Animal a3 = new Perro(4);
        listaAnimales.add(a1);
        listaAnimales.add(a2);
        listaAnimales.add(a3);

        for (Animal a : listaAnimales) {
            a.hacerSonido();
        }
    }
}