import javax.swing.*;
import java.util.ArrayList;

public class ArrayList3_1 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<String>();
        String[] opciones = {"Añadir", "Buscar", "Eliminar", "Mostrar productos", "Salir"};
        int opcion;
        String s;
        do {
            opcion = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
            switch (opcion){
                case 0:
                    s = JOptionPane.showInputDialog("¿Que producto quieres añadir?");
                    add(s, productos);
                    break;
                case 1:
                    s = JOptionPane.showInputDialog("¿Que producto quieres buscar?");
                    buscar(s, productos);
                    break;
                case 2:
                    s = JOptionPane.showInputDialog("¿Que producto quieres buscar?");
                    eliminar(s, productos);
                    break;
                case 3:
                    System.out.println(productos);
                    break;
                case 4:
                    System.out.println("Has salido");
                    break;
            }
        }while (opcion != 4);
    }

    private static void add(String s, ArrayList<String> productos) {
        productos.add(s);
    }

    private static void eliminar(String s, ArrayList<String> productos) {
        if (productos.contains(s)){
            productos.remove(s);
        }else {
            System.out.println("No se ha encontrado el producto "+s);
        }
    }

    private static void buscar(String s, ArrayList<String> productos) {
        if (productos.contains(s)){
            System.out.println("El producto "+s+" está en la posición "+productos.indexOf(s));
        }else {
            System.out.println("No se ha encontrado el producto "+s);
        }
    }
}
