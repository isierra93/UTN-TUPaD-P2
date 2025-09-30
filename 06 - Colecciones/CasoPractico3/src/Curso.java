
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                '}';
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        if (profesor == null) {
            this.profesor = null;
            return;
        }
        if (this.profesor != profesor) {
            this.profesor.eliminarCurso(this);
            this.profesor = profesor;
            profesor.agregarCurso(this);
        }
    }
}
