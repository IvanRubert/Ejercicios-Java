import java.io.File;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        File raiz = File.listRoots()[0];
        File ruta = new File(raiz.getAbsolutePath());
        String temp;
        int opcion = 0;

        DateFormat formatter;
        formatter = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,
                DateFormat.MEDIUM, Locale.getDefault());

        while (opcion != -1) {
            int num = 1;
            System.out.println("Lista de ficheros y directorios del directorio: " + ruta.getAbsolutePath());
            System.out.println("----------------------------------------------------");
            System.out.println(0 + ".- Directorio padre");
            for (File e : ruta.listFiles()) {
                if (e.isFile()){
                    System.out.println(num + ".- \t" + "-"+permisos(e) + String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t\t" + e.getName());
                }
                if (e.isDirectory()){
                    System.out.println(num + ".- \t" + "d"+permisos(e) + "\t" + String.format("%-15d", e.length()) + formatter.format(e.lastModified()) + "\t\t" + e.getName());
                }
                num++;
            }
            System.out.print("Introduce una opción (-1 para salir): ");
            opcion = inputValue.nextInt();

            if (opcion>num) {
                System.out.println("Opción incorrecta");
            }else{
                if (opcion == 0 && ruta.getName() != raiz.getName()) {
                    temp = ruta.getParent();
                    ruta = new File(temp);
                } else if (opcion > 0) {
                    temp = ruta.listFiles()[opcion - 1].getAbsolutePath();
                    File rutaTemp = new File(temp);
                    if (rutaTemp.isDirectory() && rutaTemp.canRead()){
                        ruta = new File(temp);
                    }else {
                        System.out.println("No se puede mostrar el contenido de " + temp);
                    }
                } else if (opcion == -1) {
                    System.out.println("Has salido");
                }
            }
        }
    }

    private static String permisos(File e) {
        String permiso = "";
        if (e.canRead()){
            permiso = "r";
        }else {permiso = "-";}
        if (e.canWrite()){
            permiso = permiso+"w";
        }else {permiso = permiso+"-";}
        if (e.canExecute()){
            permiso = permiso+"x";
        }else {permiso = permiso+"-";}
        return permiso;
    }
}
