import java.util.ArrayList;
import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxRepeticiones = 0;
        ArrayList<Character> charMax = new ArrayList<Character>();
        System.out.print("Introduce una frase: ");
        String s = input.nextLine().toLowerCase().replaceAll(" +", "");
        for (int i = 0; i < s.length(); i++) {
            int contador = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){contador++;}
            }
            if (contador > maxRepeticiones){
                maxRepeticiones = contador;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int contador = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){contador++;}
            }
            if (contador == maxRepeticiones && !charMax.contains(s.charAt(i))){
                charMax.add(s.charAt(i));
            }
        }
        System.out.println("Los caracteres con mas repeticiones son: "+charMax);
    }
}
