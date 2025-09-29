//        Tareas a realizar
//        1. Crear al menos cinco productos con diferentes categorías y agregarlos al
//        inventario.
//        2. Listar todos los productos mostrando su información y categoría.
//        3. Buscar un producto por ID y mostrar su información.
//        4. Filtrar y mostrar productos que pertenezcan a una categoría específica.
//        5. Eliminar un producto por su ID y listar los productos restantes.
//        6. Actualizar el stock de un producto existente.
//        7. Mostrar el total de stock disponible.
//        8. Obtener y mostrar el producto con mayor stock.
//        9. Filtrar productos con precios entre $1000 y $3000.
//        10. Mostrar las categorías disponibles con sus descripciones

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Se crea inventario y se cargan productos.
        Inventario inventario = new Inventario();
        crearyCargarProductos(inventario);
        //Se listan todos los productos.
        System.out.println("Todos los productos:");
        inventario.listarProductos();
        //Se busca un producto por id.
        System.out.println("Se busca producto con ID: POI456");
        System.out.println(inventario.buscarProductoPorId("POI456"));
        //Filtrar y mostrar productos que pertenezcan a una categoría específica.
        System.out.println("Filtrado por categoria: " + CategoriaProducto.ELECTRONICA);
        ArrayList<Producto> prodFiltradosPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        for (Producto p : prodFiltradosPorCategoria) {
            System.out.println(p);
        }
        //Eliminar un producto por su ID y listar los productos restantes.
        System.out.println("Se elimina ID:TYU745 y se listan productos.");
        inventario.eliminarProducto("TYU745");
        inventario.listarProductos();
        //Actualizar el stock de un producto existente.
        inventario.actualizarStock("FGH321", 77);
        //Mostrar el total de stock disponible.
        System.out.println("Stock total: " + inventario.obtenerTotalStock());
        //Obtener y mostrar el producto con mayor stock.
        System.out.println("Producto con mayor Stock: ");
        Producto prodConMayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println(prodConMayorStock);
        //Filtrar productos con precios entre $1000 y $3000.
        System.out.println("Productos filtrados por precio:");
        ArrayList<Producto> prodFiltradosPorPrecio = inventario.filtrarProductosPorPrecio(1000,3000);
        for (Producto p : prodFiltradosPorPrecio) {
            System.out.println(p);
        }
        //Mostrar las categorías disponibles con sus descripciones
        inventario.mostrarCategoriasDisponibles();
    }

    private static void crearyCargarProductos(Inventario i) {
        Producto p1 = new Producto("ASD123", "LECHE 1L", 1600, 300, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("FGH321", "TV LED 32'",  320000 , 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("JKL098", "LAVANDINA 1L", 3000, 225, CategoriaProducto.HOGAR);
        Producto p4 = new Producto("POI456", "IPHONE 13 PRO", 980000, 3, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("TYU745", "POLENTA 500 GR", 2800, 155, CategoriaProducto.ALIMENTOS);

        i.agregarProducto(p1);
        i.agregarProducto(p2);
        i.agregarProducto(p3);
        i.agregarProducto(p4);
        i.agregarProducto(p5);
    }
}