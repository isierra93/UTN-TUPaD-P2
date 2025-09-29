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
        Inventario inventario = new Inventario();
        crearyCargarProductos(inventario);


    }

    private static void crearyCargarProductos(Inventario i) {
        Producto p1 = new Producto("ASD123", "LECHE", 1600, 300, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("FGH321", "TV LED 32'",  320000 , 25, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("JKL098", "LAVANDINA", 3000, 225, CategoriaProducto.HOGAR);

        i.agregarProducto(p1);
        i.agregarProducto(p2);
        i.agregarProducto(p3);
    }
}