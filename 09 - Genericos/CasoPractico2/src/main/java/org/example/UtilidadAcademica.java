package org.example;

import java.util.List;

public class UtilidadAcademica {

    public static void imprimirResumen(PlanDeEstudio<? extends Materia> planDeEstudio) {
        int creditosTotalesDelPlan = 0;

        for (Materia m : planDeEstudio.obtenerMateriasOrdenadas()) {
            creditosTotalesDelPlan += m.getCreditos();
        }

        System.out.println("Creditos totales del plan: " + creditosTotalesDelPlan);
    }

    public static <T extends Materia & Comparable<T>> void transferirAprobadas(PlanDeEstudio<T> plan, List<? super T> actaDeFinales) {
        List<T> materiasDelPlan = plan.obtenerMateriasOrdenadas();
        actaDeFinales.addAll(materiasDelPlan);
    }
}
