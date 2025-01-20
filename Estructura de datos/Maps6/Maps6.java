import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps6 {
    public static void main(String[] args) {
        Map<String, String> apellidosRep = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String linea;
        try {
            FileReader abrirArchivo = new FileReader("apellidos.csv");
            BufferedReader lector = new BufferedReader(abrirArchivo);
            while ((linea = lector.readLine()) != null){
                String[] contenido = linea.split(",");
                apellidosRep.put(contenido[0], contenido[1]);
            }
            lector.close();
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        System.out.print("¿Qué apellido quieres comprobar? ");
        System.out.println(apellidosRep.getOrDefault(input.nextLine().trim().toUpperCase(), "No se ha encontrado el apellido"));

    }
}
