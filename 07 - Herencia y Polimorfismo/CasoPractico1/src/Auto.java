public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca=" + getMarca() +
                ", modelo=" + getModelo() +
                ", cantidadPuertas=" + cantidadPuertas +
                '}';
    }

    @Override
    public void mostrarInfo() {
        System.out.println(this);
    }

}
