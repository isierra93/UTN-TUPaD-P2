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

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("ASD123", "LECHE", 1600, 300, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("FGH321", "TV LED 32'",  320000 , 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("JKL098", "LAVANDINA", 3000, 233, CategoriaProducto.HOGAR);
        Inventario inv = new Inventario();
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        inv.agregarProducto(p3);

        inv.listarProductos();
        inv.eliminarProducto("ASD123");
        inv.listarProductos();
    }
}