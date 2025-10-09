public class Perro extends Animal {
    public Alimentacion alimentacion = Alimentacion.CARNIVORO;

    public Perro(int edad) {
        super(edad);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "alimentacion=" + alimentacion +
                ", edad=" + edad + "} ";
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }

    @Override
    public void describirAnimal() {
        System.out.println(this);
    }
}
