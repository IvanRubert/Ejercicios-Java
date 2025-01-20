import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuantos numeros vas a introducir? ");
        int numRep = input.nextInt();
        input.nextLine();
        String[] palabras = new String[numRep];
        for (int i = 0; i < numRep; i++) {
            System.out.print("Introduce una palabra ("+(i+1)+"-"+numRep+"): ");
            palabras[i]= input.nextLine();
        }

        String[] palabrasSinRepeticiones = eliminaDuplicados(palabras);
        for (String palabra: palabrasSinRepeticiones){
            System.out.println(palabra+" ");
        }
    }

    private static String[] eliminaDuplicados(String[] palabras) {
        Set<String> sinDuplicados = new HashSet<>();
        for (String palabra :palabras){
            sinDuplicados.add(palabra);
        }
        return sinDuplicados.toArray(new String[sinDuplicados.size()]);
    }
}
