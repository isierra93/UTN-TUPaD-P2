import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();


//● agregarProducto(Producto p)
//● listarProductos()
//● buscarProductoPorId(String id)
//● eliminarProducto(String id)
//● actualizarStock(String id, int nuevaCantidad)
//● filtrarPorCategoria(CategoriaProducto categoria)
//● obtenerTotalStock()
//● obtenerProductoConMayorStock()
//● filtrarProductosPorPrecio(double min, double max)
//● mostrarCategoriasDisponibles()

    public void agregarProducto(Producto p) {
        //Ver de agregar validaciones
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto prod : productos){
            prod.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        Producto prodEncontrado = null;
        int i = 0;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id) ) {
            i++;
        }
        if (i < productos.size()){
            prodEncontrado = this.productos.get(i);
        }
        return prodEncontrado;
    }

    public void eliminarProducto(String id) {
        Producto prodaBorrar = buscarProductoPorId(id);

        productos.remove(prodaBorrar);
    }

}
