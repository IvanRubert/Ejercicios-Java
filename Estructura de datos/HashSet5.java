import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet5 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        a.addAll(Arrays.asList(new String[] {"Hola", "prueba", "esta", "duplicado"}));
        b.addAll(Arrays.asList(new String[] {"de", "esta", "esto", "es", "Hola"}));

        Set<String> interseccion = new HashSet<>();
        interseccion = mantenerBListas(a, b);

        System.out.println(interseccion);
    }

    private static Set<String> mantenerBListas(Set<String> a, Set<String> b) {
        Set<String> interseccion = new HashSet<>(a);
        interseccion.retainAll(b);
        return interseccion;
    }
}
