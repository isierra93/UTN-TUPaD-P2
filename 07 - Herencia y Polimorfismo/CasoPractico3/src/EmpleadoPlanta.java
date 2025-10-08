public class EmpleadoPlanta extends Empleado {
    final static double BONUS_PLANTA = 1.25;

    public EmpleadoPlanta(String idEmpleado, String nombreCompleto, double sueldoBase) {
        super(idEmpleado, nombreCompleto, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() * BONUS_PLANTA;
    }
}
