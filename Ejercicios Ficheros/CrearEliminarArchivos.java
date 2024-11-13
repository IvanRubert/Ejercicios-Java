import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CrearEliminarArchivos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File f;
        String linia = "";

        System.out.println("1. Crear archivo vacio");
        System.out.println("2. Crear/Modificar archivo con contenido");
        System.out.println("3. Eliminar archivo");
        System.out.print("Introduce una opción: ");
        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                try {
                    System.out.print("Introduce la ruta y nombre del archivo: ");
                    f = new File(input.nextLine());
                    if (f.createNewFile()) {
                        System.out.println("Creado ok: " + f.getName());
                    } else {
                        System.out.println("El fichero ya existe.");
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            case 2:
                try {
                    System.out.print("Introduce la ruta y nombre del archivo: ");
                    String nombreArchivo = input.nextLine();
                    FileWriter editor = new FileWriter(nombreArchivo, true);
                    PrintWriter escribir = new PrintWriter(editor);
                    do{
                        System.out.print("Introduce el contenido linia a linia ('/end' para terminar): ");
                        linia = input.nextLine();
                        if (!linia.equals("/end")){
                            escribir.println(linia);
                        }
                    }while (!linia.equals("/end"));
                    escribir.close();
                    System.out.println("Escritura de '" + nombreArchivo + "' OK");
                } catch (IOException e) {
                    System.out.println("error: " + e.getMessage());
                }
                break;
            case 3:
                System.out.print("Introduce la ruta y nombre del archivo: ");
                f = new File(input.next());
                if (f.delete()){
                    System.out.println("Eliminado ok: " + f.getName());
                }else {
                    System.out.println("El fichero no existia previamente.");
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
    }
}
