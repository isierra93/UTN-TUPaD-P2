//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("LKJ123", "Programación 1");
        Curso c2 = new Curso("LKJ123", "Matemática");
        Curso c3 = new Curso("LKJ123", "Inglés");
        Profesor p1 = new Profesor("1", "Ariel", "Ingeniero de sistemas");
        Profesor p2 = new Profesor("2", "Marta", "Licenciada en idiomas");

        
        Universidad uni = new Universidad("UTN");

        uni.listarCursos();
    }
}