
public class Main {
    public static void main(String[] args) {
        Stock<Producto> stockProductos = new Stock<>();
        stockProductos.agregarItem(new Producto(4,"Yerba", 1600.55));
        stockProductos.agregarItem(new Producto(2,"Café", 8800.25));
        stockProductos.agregarItem(new Producto(11,"Azucar", 2600));

        System.out.println("Items ordenados naturalmente:");
        System.out.println(stockProductos.obtenerItemsOrdenadosNaturalmente());

        System.out.println("Items ordenados por Nombre :");
        System.out.println(stockProductos.obtenerItemsOrdenados(new ComparadorProductoPorNombre()));

        System.out.println("Items ordenados por Precio:");
        System.out.println(stockProductos.obtenerItemsOrdenados(new ComparadorProductoPorPrecio()));
    }
}