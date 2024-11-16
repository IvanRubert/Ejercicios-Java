import java.io.*;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Scanner;

public class CrearEliminarArchivosConRuta {
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
            System.out.println("Introduce una opción (-1 para salir): ");
            opcion = inputValue.nextInt();

            if (opcion>num){
                System.out.println("Opción incorrecta");
            } else{
                if (opcion == 0 && ruta.getName() != raiz.getName()) {
                    temp = ruta.getParent();
                    ruta = new File(temp);
                } else if (opcion > 0) {
                    temp = ruta.listFiles()[opcion - 1].getAbsolutePath();
                    File rutaTemp = new File(temp);
                    if (rutaTemp.isDirectory() && rutaTemp.canRead()){
                        ruta = new File(temp);
                    } else if (rutaTemp.isFile() && rutaTemp.canRead() && rutaTemp.canWrite()){
                        try {
                            FileReader abrirArchivo;
                            FileWriter abrirEditor;
                            System.out.print("1. Leer\n2. Modificar\n3. Eliminar\nQue quieres hacer? ");
                            opcion = inputValue.nextInt();
                            switch (opcion){
                                case 1:
                                    abrirArchivo = new FileReader(rutaTemp);
                                    leerContenido(abrirArchivo, inputValue);
                                    break;
                                case 2:
                                    System.out.print("1. Añadir al final\n2. Sobreescribir\nQue quieres hacer? ");
                                    opcion = inputValue.nextInt();
                                    switch (opcion){
                                        case 1:
                                            abrirEditor = new FileWriter(rutaTemp, true);
                                            modificarContenido(abrirEditor, inputValue);
                                            break;
                                        case 2:
                                            abrirEditor = new FileWriter(rutaTemp, false);
                                            modificarContenido(abrirEditor, inputValue);
                                            break;
                                        default:
                                            throw new IOException("Opción incorrecta");
                                    }
                                    break;
                                case 3:
                                    rutaTemp.delete();
                                    break;
                                default:
                                    throw new IOException("Opción incorrecta");
                            }
                        } catch (IOException e) {
                            System.out.println("Error: "+e.getMessage());
                        }
                    }
                    else {
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

    private static void leerContenido(FileReader abrirArchivo, Scanner input) {
        try {
            BufferedReader lector = new BufferedReader(abrirArchivo);
            String linia;
            input.nextLine();
            System.out.println("-------------------------------------------");
            while ((linia = lector.readLine()) != null){
                System.out.println(linia);
            }
            lector.close();
            System.out.print("Pulsa enter para continuar: ");
            String continuar = input.nextLine();
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    private static void modificarContenido(FileWriter abrirEditor, Scanner input) {
        PrintWriter escribir = new PrintWriter(abrirEditor);
        String linia = "";
        input.nextLine();
        while (!linia.equals("/end")) {
            System.out.print("Introduce linia a linia lo que quieras escribir (/end para terminar): ");
            linia = input.nextLine();
            if (!linia.equals("/end")){
                escribir.println(linia);
            }
        }
        escribir.close();
    }

}