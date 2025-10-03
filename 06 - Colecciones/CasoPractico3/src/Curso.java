
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //toString evitando recursividad al llamar a profesor
    @Override
    public String toString() {
        if (profesor != null) {
            return "Curso{" +
                    "codigo='" + codigo + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", profesor=" + profesor.getNombre() +
                    '}';
        }
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

    public void setProfesor(Profesor p) {
        this.profesor = p;
    }
}
