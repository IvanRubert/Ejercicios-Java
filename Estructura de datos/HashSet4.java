import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet4 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        a.addAll(Arrays.asList(new String[] {"Hola", "prueba", "esta", "duplicado"}));
        b.addAll(Arrays.asList(new String[] {"de", "esta", "esto", "es", "Hola"}));

        Set<String> union = new HashSet<>();
        union = unirListas(a, b);

        System.out.println(union);
    }

    private static Set<String> unirListas(Set<String> a, Set<String> b) {
        Set<String> union = new HashSet<>(a);
        union.addAll(b);
        return union;
    }
}
