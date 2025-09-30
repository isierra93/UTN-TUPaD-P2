import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<Libro>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo,anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro l : libros ) {
            System.out.println(l);
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroEncontrado = null;
        int i = 0;
        while (i < libros.size() && !libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        if (i < libros.size()){
            libroEncontrado = libros.get(i);
        }
        return libroEncontrado;
    }

    public void eliminarLibro(String isbn) {
        Libro libroaEliminar = buscarLibroPorIsbn(isbn);
        if (libroaEliminar != null) {
            libros.remove(libroaEliminar);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosFiltradosPorAnio = new ArrayList<>();
        for (Libro l : libros){
            if (l.getAnioPublicacion() == anio) {
                librosFiltradosPorAnio.add(l);
            }
        }
        return librosFiltradosPorAnio;
    }

    public List<Autor> mostrarAutoresDisponibles() {
        List<Autor> autoresDisponibles = new ArrayList<>();
        for (Libro l : libros) {
            if (!autoresDisponibles.contains(l.getAutor())){
                autoresDisponibles.add(l.getAutor());
            }
        }
        return autoresDisponibles;
    }

//    public Autor buscarAutorPorId(String id) {
//        Autor autorEncontrado = null;
//        int i = 0;
//        while (i < libros.size() && !libros.get(i).getIsbn().equals(isbn)){
//            i++;
//        }
//        if (i < libros.size()){
//            autorEncontrado = libros.get(i);
//        }
//        return autorEncontrado;
//    }


}
