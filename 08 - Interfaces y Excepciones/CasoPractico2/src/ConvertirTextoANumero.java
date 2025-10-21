import java.util.Scanner;

public class ConvertirTextoANumero {

    public void converirTexto() {
        String textoUsuario = solicitarTexto();
        try {
            int textoConvertido = Integer.parseInt(textoUsuario);
            System.out.println("Texto convertido: " + textoConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número válido.");
        }
    }

    private String solicitarTexto() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un texto a convertir en numero: ");
        return input.nextLine();
    }
}
