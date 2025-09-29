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

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto prodEncontrado = buscarProductoPorId(id);
        if (prodEncontrado != null) {
            prodEncontrado.setCantidad(nuevaCantidad);
        }
    }

    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> prodFiltrados = new ArrayList<>();
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCategoriaProducto() == categoria ) {
                prodFiltrados.add(productos.get(i));
            }
        }
        return prodFiltrados;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto prod : productos) {
            totalStock = totalStock + prod.getCantidad();
        }
        return totalStock;
    }

    public Producto obtenerProductoConMayorStock() {
        Producto prodConMayorStock = null;
        int mayorStock = 0;
        for (Producto prod : productos) {
            if (prod.getCantidad() > mayorStock) {
                mayorStock = prod.getCantidad();
                prodConMayorStock = prod;
            }
        }

        return prodConMayorStock;
    }

}
