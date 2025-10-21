import java.util.Scanner;

public class Validador {

    public void validarEdad() {
        System.out.println("Ingrese una edad: ");
        Scanner input = new Scanner(System.in);
        int edad = input.nextInt();
        try {
            if (comprobarEdad(edad)) {
                System.out.println("La edad es valida.");
            }
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    private boolean comprobarEdad(int age) throws EdadInvalidaException {
        if (age < 0 || age > 120) {
            throw new EdadInvalidaException("Error: Edad invalida.");
        }
        return true;
    }
}

