import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> titulosLibros = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        int opcion = 1;
        do {
            System.out.println("1. Agregar libros\n2. Eliminar libros\n3. Buscar libro\n4. Mostrar libros alfabeticamente\n0. Salir");
            System.out.print("¿Que quieres hacer? ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("¿Cual es el titulo del libro? ");
                    addLibro(titulosLibros,input.nextLine());
                    break;
                case 2:
                    System.out.print("¿Cual es el titulo del libro? ");
                    eliminarLibro(titulosLibros, input.nextLine());
                    break;
                case 3:
                    System.out.print("¿Cual es el titulo del libro? ");
                    buscarLibro(titulosLibros, input.nextLine());
                    break;
                case 4:
                    mostrarLibrosAsc(titulosLibros);
                    break;
                case 0:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opcion != 0);
    }

    private static void mostrarLibrosAsc(ArrayList<String> titulosLibros) {
        titulosLibros.sort(Comparator.naturalOrder());
        System.out.println(titulosLibros);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addLibro(ArrayList<String> titulosLibros, String s) {
        titulosLibros.add(s);
    }

    private static void eliminarLibro(ArrayList<String> titulosLibros, String s) {
        if (titulosLibros.contains(s)){
            titulosLibros.remove(s);
        }else {
            System.out.println("El libro no se encuentra");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void buscarLibro(ArrayList<String> titulosLibros, String s) {
        int pos = titulosLibros.indexOf(s);
        if (pos == -1){
            System.out.println("El libro no se encuentra");
        }else {
            System.out.println("El libro " + s + " está en la posición " + titulosLibros.indexOf(s));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
