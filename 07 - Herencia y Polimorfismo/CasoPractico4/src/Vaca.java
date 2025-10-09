public class Vaca extends Animal {
    public Alimentacion alimentacion = Alimentacion.HERVIBORO;

    public Vaca(int edad) {
        super(edad);
    }

    @Override
    public String toString() {
        return "Vaca{" +
                "alimentacion=" + alimentacion +
                ", edad=" + edad + "} ";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Muuu");
    }

    @Override
    public void describirAnimal() {
        System.out.println(this);
    }
}
