import java.util.ArrayList;
import java.util.List;

public class UtilidadInventario {
    public static void imprimirNombres(Stock<? extends Producto> stockDeProductos) {
        List<? extends Producto> stockOrdenado;
        stockOrdenado = stockDeProductos.obtenerItemsOrdenadosNaturalmente();

        for (Producto p : stockOrdenado){
            System.out.println(p.getNombre());
        }
    }

    public static <T extends Comparable<T> > void transferirItems(Stock<T> origen, Stock<? super T> destino) {
        List<T> itemsOrigen = new ArrayList<>(origen.obtenerItemsOrdenadosNaturalmente());

        for (T t : itemsOrigen){
            destino.agregarItem(t);
        }
    }
}
