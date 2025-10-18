import java.util.ArrayList;

public class Pedido implements Pagable{
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public Pedido() {
    }

    public void agregarProducto (Producto p) {
        if (!listaProductos.contains(p)) {
            listaProductos.add(p);
        }
    }

    public void quitarProducto (Producto p) {
        listaProductos.remove(p);
    }

    public void mostrarProductos() {
        System.out.println("El pedido : " + this);
        for (Producto p : listaProductos) {
            System.out.println(p.getNombre());
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }
}
