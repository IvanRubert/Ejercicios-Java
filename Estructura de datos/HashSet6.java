import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet6 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        a.addAll(Arrays.asList(new String[] {"Hola", "prueba", "esta", "duplicado"}));
        b.addAll(Arrays.asList(new String[] {"de", "esta", "esto", "es", "Hola"}));
        Set<String> unicos = new HashSet<>();
        unicos = elementosUnicos(a, b);
        System.out.println(unicos);
    }

    private static Set<String> elementosUnicos(Set<String> a, Set<String> b) {
        Set<String> unicos = new HashSet<>(a);
        Set<String> interseccion = new HashSet<>(a);
        interseccion.retainAll(b);
        unicos.addAll(b);
        unicos.removeAll(interseccion);
        return unicos;
    }
}
