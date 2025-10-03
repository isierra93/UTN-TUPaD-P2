//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("1", "Ariel", "Ingeniero en sistemas");
        Profesor p2 = new Profesor("2", "Marta", "Licenciada en idiomas");
        Profesor p3 = new Profesor("3", "Matias", "Administracion de empresas");
        Curso c1 = new Curso("LKJ123", "Programación 1");
        Curso c2 = new Curso("OIJ321", "Matemática");
        Curso c3 = new Curso("PPE323", "Inglés");
        Curso c4 = new Curso("EUI377", "Fitopatología");
        Curso c5 = new Curso("EUYN33", "Programacion 2");
//        2. Agregar profesores y cursos a la universidad.
        Universidad uni = new Universidad("UTN");
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);
//        3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        uni.asignarProfesorACurso("PPE323", "2");
        uni.asignarProfesorACurso("LKJ123", "1");
        uni.asignarProfesorACurso("EUYN33", "1");
        uni.asignarProfesorACurso("OIJ321","3");
        uni.asignarProfesorACurso("EUI377","3");
//        4. Listar cursos con su profesor y profesores con sus cursos.
        System.out.println("-------------\n Listado de Cursos:");
        uni.listarCursos();
        System.out.println("-------------\n Listado de Profesores:");
        uni.listarProfesores();
//        5. Cambiar el profesor de un curso y verificar que ambos lados quedan
//        sincronizados.
        System.out.println("-------------\n Se asigna Curso:PPE323 a Profesor ID: 1:");
        uni.asignarProfesorACurso("PPE323", "1");
        System.out.println("-------------\n Listado de Cursos:");
        uni.listarCursos();
//        6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("-------------\n Se elimina Ingles:");
        uni.eliminarCurso("PPE323");
        uni.listarProfesores();
//        7. Remover un profesor y dejar profesor = null,
        System.out.println("-------------\n Remover un profesor::");
        
//        8. Mostrar un reporte: cantidad de cursos por profesor.

    }
}