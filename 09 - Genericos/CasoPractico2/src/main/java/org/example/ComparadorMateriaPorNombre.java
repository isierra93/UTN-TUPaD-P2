package org.example;

import java.util.Comparator;

public class ComparadorMateriaPorNombre implements Comparator<Materia> {

    @Override
    public int compare(Materia o1, Materia o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
