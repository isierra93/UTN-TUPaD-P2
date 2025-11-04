import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stock < T extends Comparable<T> >{
    private List<T> items;

    public Stock() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(T item) {
        if (!this.items.contains(item)){
            this.items.add(item);
        }
    }

    public List<T> obtenerItemsOrdenadosNaturalmente() {
        List<T> itemsOrdenados = new ArrayList<>(items);
        Collections.sort(itemsOrdenados);
        return itemsOrdenados;
    }

    public List<T> obtenerItemsOrdenados(Comparator<T> comparador) {
        List<T> itemsOrdenados = new ArrayList<>(items);
        Collections.sort(itemsOrdenados, comparador);
        return itemsOrdenados;
    }

    public List<T> buscarItems(Criterio<T> criterio) {
        List<T> nuevaLista = new ArrayList<>();
        for (T t : items){
            if (criterio.cumple(t)){
                nuevaLista.add(t);
            }
        }
        return nuevaLista;
    }

}
