import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Introduce la ruta del archivo CSV: ");
            FileReader abrirArchivo = new FileReader(input.nextLine());
            BufferedReader lector = new BufferedReader(abrirArchivo);
            String[] cabecera = lector.readLine().split(",");
            String linia;
            while ((linia = lector.readLine()) != null){
                String[] contenido = linia.split(",");
                for (int i = 0; i<cabecera.length; i++){
                    System.out.println(cabecera[i]+": "+contenido[i]);
                }
                System.out.println("-------------------------------");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
