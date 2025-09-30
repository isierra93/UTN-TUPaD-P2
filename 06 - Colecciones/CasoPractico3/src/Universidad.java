import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    //Agregar validaicon de idprofesor
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) {
            profesores.add(p);
        }
    }
    //Agregar validacion de codigo
    public void agregarCurso(Curso c) {
        Curso codigoValido = buscarCursoPorCodigo(c.getCodigo());
        if (!cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profe = buscarProfesorPorId(idProfesor);
        if (curso != null && profe != null) {
            curso.setProfesor(profe);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        Profesor profeEncontrado = null;
        int i = 0;
        while (i < profesores.size() && !profesores.get(i).getId().equals(id)){
            i++;
        }
        if (i <profesores.size()) {
            profeEncontrado = profesores.get(i);
        }
        return profeEncontrado;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        Curso cursoEncontrado = null;
        int i = 0;
        while (i < cursos.size() && !cursos.get(i).getCodigo().equals(codigo)){
            i++;
        }
        if (i <cursos.size()) {
            cursoEncontrado = cursos.get(i);
        }
        return cursoEncontrado;
    }

    //• eliminarCurso(String codigo) → Debe romper la relación con su profesor
//si la hubiera.
    public void eliminarCurso(String codigo) {
        Curso cursoaEliminar = buscarCursoPorCodigo(codigo);
        if (cursoaEliminar != null) {
            cursoaEliminar.setProfesor(null);
            cursos.remove(cursoaEliminar);
        }
    }

    //• eliminarProfesor(String id) → Antes de remover, dejar null los cursos que
//dictaba.

    public void eliminarProfesor(String id) {

    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores.");
            return;
        }
        for (Profesor profe : profesores) {
            System.out.println(profe);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos.");
            return;
        }
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

}
