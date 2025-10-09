public abstract class Animal {
    public int edad;

    public Animal(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void hacerSonido();

    public abstract void describirAnimal();
}
