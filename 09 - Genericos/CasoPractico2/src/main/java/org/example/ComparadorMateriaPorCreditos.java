package org.example;

import java.util.Comparator;

public class ComparadorMateriaPorCreditos implements Comparator<Materia> {
    @Override
    public int compare(Materia o1, Materia o2) {
        return o2.getCreditos() - o1.getCreditos();
    }
}
