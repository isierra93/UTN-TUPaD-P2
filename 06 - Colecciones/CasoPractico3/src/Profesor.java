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

    //toString evitando recursividad al llamar a cursos
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

    public List<Curso> getCursos() {
        return cursos;
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("El profesor: " +
                    this.nombre+
                    " no tiene cursos asignados.");
            return;
        }
        for (Curso c : cursos) {
            System.out.println("Codigo: "+c.getCodigo()+"\n"+
                    "Nombre del curso: " +c.getNombre()+"\n"+
                    "Profesor: " +c.getProfesor());
        }
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) { // Evita bucle
                c.setProfesor(this);
            }
        }
    }

    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) { // Solo lo desasocia si corresponde
                c.setProfesor(null);
            }
        }
    }

}
