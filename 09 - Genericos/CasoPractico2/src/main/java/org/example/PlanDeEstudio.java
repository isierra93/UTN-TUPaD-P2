package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlanDeEstudio<T extends Materia & Comparable<? super T> > {
    private List<T> materias;

    public PlanDeEstudio() {
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(T materia) {
        materias.add(materia);
    }

    public List<T> obtenerMateriasOrdenadas() {
        List<T> materiasOrdenadas = new ArrayList<>(materias);
        Collections.sort(materiasOrdenadas);
        return materiasOrdenadas;
    }

    public List<T> obtenerMateriasOrdenadas(Comparator<? super T> comparador) {
        List<T> materiasOrdenadas = new ArrayList<>(materias);
        materiasOrdenadas.sort(comparador);
        return materiasOrdenadas;
    }

    public List<T> filtrarMaterias(Requisito<T> requisito){
        List<T> materiasCumplenRequisito = new ArrayList<>();
        for (T t : materias){
            if (requisito.esCumplido(t)){
                materiasCumplenRequisito.add(t);
            }
        }

        return materiasCumplenRequisito;
    }
}
