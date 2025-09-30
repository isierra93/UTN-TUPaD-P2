import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    //Constructor sobrecargado para recibir una lista de cursos
    //Se deberia inicializar el arralist en el constructor - Ver despues
//    public Profesor(String id, String nombre, String especialidad, List<Curso> cursos) {
//        this.id = id;
//        this.nombre = nombre;
//        this.especialidad = especialidad;
//        for (Curso c : cursos) {
//            this.agregarCurso(c);
//        }
//    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cursosTotales=" + cursos.size() +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println("Codigo: "+c.getCodigo()+"\n"+
                    "Nombre del curso: " +c.getNombre());
        }
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }

    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {
            cursos.remove(c);
            c.setProfesor(null);
        }
    }
}
