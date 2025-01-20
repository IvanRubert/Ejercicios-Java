import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSet3 {
    public static void main(String[] args) {
        String[] array = {"Hola", "prueba", "esta", "duplicado", "de", "esta", "esto", "es", "Hola"};

        Set<String> diferencia = new HashSet<>();
        diferencia = mantenerDiferenciaListas(array);

        System.out.println(diferencia);
    }

    private static Set<String> mantenerDiferenciaListas(String[] array) {
        Set<String> a = new HashSet<>();
        Set<String> repetido = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (a.contains(array[i])){
                repetido.add(array[i]);
            }else{
                a.add(array[i]);
            }
        }
        return repetido;
    }
}


