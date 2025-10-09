public class Gato extends Animal {
    public Alimentacion alimentacion = Alimentacion.CARNIVORO;

    public Gato(int edad) {
        super(edad);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "alimentacion=" + alimentacion +
                ", edad=" + edad + "} ";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public void describirAnimal() {
        System.out.println(this);
    }
}
