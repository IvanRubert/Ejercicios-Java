import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet6 {
    public static void main(String[] args) {
        elementosUnicos("hola", "adios", "Pepe", "Pepe", "hola");
    }

    private static void elementosUnicos(String ... array) {
        List<String> lista = Arrays.asList(array);
        Set<String> unicos = new HashSet<>(lista);
        System.out.println(unicos);
    }
}
