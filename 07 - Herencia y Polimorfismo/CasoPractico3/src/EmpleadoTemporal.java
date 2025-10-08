public class EmpleadoTemporal extends Empleado {
    final static double BONUS_TEMPORAL = 1.15;

    public EmpleadoTemporal(String idEmpleado, String nombreCompleto, double sueldoBase) {
        super(idEmpleado, nombreCompleto, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * BONUS_TEMPORAL;
    }
}
