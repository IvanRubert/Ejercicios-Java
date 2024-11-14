import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        File raiz = File.listRoots()[0];
        File ruta = new File(raiz.getAbsolutePath());
        String temp;
        int opcion = 0;

        while (opcion != -1) {
            int num = 1;
            System.out.println("Lista de ficheros y directorios del directorio: " + ruta.getAbsolutePath());
            System.out.println("----------------------------------------------------");
            System.out.println(0 + ".- Directorio padre");
            for (File e : ruta.listFiles()) {
                if (!e.isHidden()) {
                    if (e.isFile()) {
                        System.out.println(num + ".- " + e.getName() + " <Archivo> " + e.length() + " bytes");
                    } else if (e.isDirectory()) {
                        System.out.println(num + ".- " + e.getName() + " <Directorio>");
                    }
                }else {
                    System.out.println(num + ".- " + e.getName() + " <Oculto>");
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
}
