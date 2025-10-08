public abstract class Empleado {
    private String idEmpleado;
    private String nombreCompleto;
    private double sueldoBase;

    public Empleado(String idEmpleado, String nombreCompleto, double sueldoBase) {
        this.idEmpleado = idEmpleado;
        this.nombreCompleto = nombreCompleto;
        this.sueldoBase = sueldoBase;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public abstract double calcularSueldo();
}
