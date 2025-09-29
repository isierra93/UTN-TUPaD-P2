import java.util.List;

//1. Creamos una biblioteca.
//2. Crear al menos tres autores
//3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca.
//4. Listar todos los libros con su información y la del autor.
//5. Buscar un libro por su ISBN y mostrar su información.
//6. Filtrar y mostrar los libros publicados en un año específico.
//7. Eliminar un libro por su ISBN y listar los libros restantes.
//8. Mostrar la cantidad total de libros en la biblioteca.
//9. Listar todos los autores de los libros disponibles en la biblioteca
public class Main {
    public static void main(String[] args) {
        //Creamos una biblioteca.
        Biblioteca b = new Biblioteca("Biblioteca Nacional Argentina");
        //Creamos los autores
        Autor a1 = new Autor("1", "Stephen King", "Estados Unidos");
        Autor a2 = new Autor("2", "Agustina Bazterrica", "Argentina");
        Autor a3 = new Autor("3", "Aldous Huxley", "Inglaterra");
        //Agregamos los libros a la biblioteca
        b.agregarLibro("89UASD", "La larga marcha", 1979, a1);
        b.agregarLibro("NLKSAD", "Cadáver exquisito", 2017, a2);
        b.agregarLibro("N1ID2U", "Un mundo feliz", 1932, a3);
        b.agregarLibro("OIJ983", "It", 1986, a1);
        b.agregarLibro("POK098", "El resplandor", 1977, a1);
        //Listar los libros
        System.out.println("Listado de libros:");
        b.listarLibros();
        //Buscar un libro por su isbn
        System.out.println("Busqueda de libro ISBN N1ID2U:");
        b.buscarLibroPorIsbn("N1ID2U").mostrarInfo();
        //
        List<Autor> autorList = b.mostrarAutoresDisponibles();
        for (Autor a : autorList) {
            System.out.println(a);
        }
    }

}