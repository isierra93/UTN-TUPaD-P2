public class Main {
    public static void main(String[] args) {
        //1. División segura
        //○ Solicitar dos números y dividirlos. Manejar ArithmeticException si el
        //divisor es cero.
        Divisor divisor = new Divisor();
        divisor.calcularDivision();

        //2. Conversión de cadena a número
        //○ Leer texto del usuario e intentar convertirlo a int. Manejar
        //NumberFormatException si no es válido.
        ConvertirTextoANumero conv = new ConvertirTextoANumero();
        conv.converirTexto();


        //3. Lectura de archivo
        //○ Leer un archivo de texto y mostrarlo. Manejar FileNotFoundException
        //si el archivo no existe.
        //        5. Uso de try-with-resources
        //○ Leer un archivo con BufferedReader usando try-with-resources.
        //Manejar IOException correctamente.
        String filePath = "CasoPractico2/files/file.txt";
        LectorDeArchivo lector = new LectorDeArchivo();
        lector.leerArchivo(filePath);

        //4. Excepción personalizada
        //○ Crear EdadInvalidaException. Lanzarla si la edad es menor a 0 o
        //mayor a 120. Capturarla y mostrar mensaje.
        Validador val = new Validador();
        val.validarEdad();

    }
}