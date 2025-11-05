package org.example;

public class Main {
    public static void main(String[] args) {
        PlanDeEstudio<Asignatura> planDeEstudio = new PlanDeEstudio<>();
        planDeEstudio.agregarMateria(new Asignatura("ZZZ333", "Matemática", 33));
        planDeEstudio.agregarMateria(new Asignatura("ASD123", "Inglés 2", 3));
        planDeEstudio.agregarMateria(new Asignatura("DSA332", "Inglés 1", 10));
        planDeEstudio.agregarMateria(new Asignatura("ZZZ111", "Base de datos 1", 7));

        System.out.println("Materias ordenadas por Codigo:");
        System.out.println(planDeEstudio.obtenerMateriasOrdenadas());

        System.out.println("Materias ordenadas por Nombre:");
        System.out.println(planDeEstudio.obtenerMateriasOrdenadas(new ComparadorMateriaPorNombre()));

        System.out.println("Materias ordenadas por Creditos:");
        System.out.println(planDeEstudio.obtenerMateriasOrdenadas(new ComparadorMateriaPorCreditos()));

        System.out.println("Materias que tengan más de 4 créditos:");
        System.out.println(planDeEstudio.filtrarMaterias(new Requisito<Asignatura>() {
            @Override
            public boolean esCumplido(Asignatura materia) {
                return materia.getCreditos() > 4;
            }
        }));
    }
}