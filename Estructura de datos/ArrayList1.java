import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Pepe");
        nombres.add("Paco");
        nombres.add("Ivan");
        nombres.add("Juan");
        nombres.add("Manolo");

        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }
        System.out.println();
        if (nombres.contains("Paco")){
            System.out.println("Paco esta en la lista");
        }
        System.out.println();
        nombres.remove("Paco");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
