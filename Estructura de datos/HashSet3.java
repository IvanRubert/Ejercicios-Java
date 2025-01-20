import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet3 {
    public static void main(String[] args) {
        Set<String> a = new HashSet<>();
        Set<String> b = new HashSet<>();
        a.addAll(Arrays.asList(new String[] {"Hola", "prueba", "esta", "duplicado"}));
        b.addAll(Arrays.asList(new String[] {"de", "esta", "esto", "es", "Hola"}));

        Set<String> diferencia = new HashSet<>();
        diferencia = mantenerDiferenciaListas(a, b);

        System.out.println(diferencia);
    }

    private static Set<String> mantenerDiferenciaListas(Set<String> a, Set<String> b) {
        Set<String> diferencia = new HashSet<>(a);
        diferencia.removeAll(b);
        return diferencia;
    }
}
