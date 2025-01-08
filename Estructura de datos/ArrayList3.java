import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<String>();
        productos.add("Patata");
        productos.add("Limon");
        productos.add("Banana");
        productos.add("Manzana");
        productos.add("Sandia");
        System.out.println(productos);

        buscar("Limon", productos);
        eliminar("Limon", productos);

        System.out.println(productos);
    }

    private static void addElement(String s, ArrayList<String> productos) {
        productos.add(s);
    }

    private static void eliminar(String s, ArrayList<String> productos) {
        productos.remove(s);
    }

    private static void buscar(String s, ArrayList<String> productos) {
        System.out.println("El producto "+s+" está en la posición "+productos.indexOf(s));
    }
}
