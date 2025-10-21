import java.util.Scanner;

public class Divisor {

    public void calcularDivision() {
        int num1 = solicitarNumero();
        int num2 = solicitarNumero();

        try {
            double resultado = division(num1, num2);
            System.out.println(num1 + " / " + num2 + " = " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private int solicitarNumero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        return input.nextInt();
    }

    private double division(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException("No se puede dividir por 0.");
        }
        return n1 / n2;
    }
}
