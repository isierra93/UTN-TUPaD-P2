import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Crear una biblioteca
        Biblioteca b = crearBiblioteca();
        //Listar los libros
        System.out.println("Listado de libros:");
        b.listarLibros();
        //Buscar un libro por su isbn
        System.out.println("Busqueda de libro isbn 'N1ID2U' :");
        Libro libroPorIsbn = b.buscarLibroPorIsbn("N1ID2U");
        System.out.println(libroPorIsbn);
        //Filtrar y mostrar los libros de un año especifico
        System.out.println("Libros filtados de 1977:");
        List<Libro> librosPorAnioFilt = b.filtrarLibrosPorAnio(1977);
        for (Libro l : librosPorAnioFilt) {
            System.out.println(l);
        }
        //Eliminar un libro por su ISBN y listar los libros restantes.
        System.out.println("Eliminar isbn N1ID2U y listar los restantes.");
        b.eliminarLibro("N1ID2U");
        b.listarLibros();
        //Mostrar la cantidad total de libros en la biblioteca.
        System.out.println("Cantidad total de libros: " + b.obtenerCantidadLibros());
        //Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("Mostrar autores disponibles:");
        List<Autor> autorList = b.mostrarAutoresDisponibles();
        for (Autor a : autorList) {
            System.out.println(a);
        }
    }

    private static Biblioteca crearBiblioteca() {
        Biblioteca b = new Biblioteca("Biblioteca Nacional Argentina");
        //Crear los autores
        Autor a1 = new Autor("1", "Stephen King", "Estados Unidos");
        Autor a2 = new Autor("2", "Agustina Bazterrica", "Argentina");
        Autor a3 = new Autor("3", "Aldous Huxley", "Inglaterra");
        //Agregar los libros a la biblioteca
        b.agregarLibro("89UASD", "La larga marcha", 1979, a1);
        b.agregarLibro("NLKSAD", "Cadáver exquisito", 2017, a2);
        b.agregarLibro("N1ID2U", "Un mundo feliz", 1932, a3);
        b.agregarLibro("OIJ983", "It", 1986, a1);
        b.agregarLibro("POK098", "El resplandor", 1977, a1);
        return b;
    }
}