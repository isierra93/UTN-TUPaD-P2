import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LectorDeArchivo {

    public void leerArchivo(String path) {

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String flag = reader.readLine();
            while (flag != null) {
                System.out.println(flag);
                flag = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado");
        } catch (IOException e) {
            System.out.println("Error: En la entrada o salida de datos.");
        }
    }
}
