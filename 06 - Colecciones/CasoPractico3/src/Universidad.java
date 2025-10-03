import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profe = buscarProfesorPorId(idProfesor);
        if (curso != null && profe != null) {
            Profesor profeAnterior = curso.getProfesor();
            if (profeAnterior != null) {
                profeAnterior.eliminarCurso(curso);
            }
            profe.agregarCurso(curso);
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

    public void eliminarCurso(String codigo) {
        Curso cursoaEliminar = buscarCursoPorCodigo(codigo);
        if (cursoaEliminar != null) {
            cursoaEliminar.getProfesor().eliminarCurso(cursoaEliminar);
            cursos.remove(cursoaEliminar);
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesoraEliminar = buscarProfesorPorId(id);
        if (profesoraEliminar != null) {
            List<Curso> cursosDelProfesoraEliminar = profesoraEliminar.getCursos();
            for (Curso c : new ArrayList<>(cursosDelProfesoraEliminar)) {
                profesoraEliminar.eliminarCurso(c);
            }
            profesores.remove(profesoraEliminar);
        }
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
