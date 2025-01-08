import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce la primera palabra: ");
        String s1 = input.next().toLowerCase();
        input.nextLine();
        System.out.print("Introduce la segunda palabra: ");
        String s2 = input.next().toLowerCase();
        input.nextLine();

        if (isAnagrama(s1, s2)){
            System.out.println("Las palabras "+s1+" y "+s2+" son anagramas");
        }else {
            System.out.println("Las palabras "+s1+" y "+s2+" no son anagramas");
        }

    }

    private static boolean isAnagrama(String s1, String s2) {
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        if (s1.length() != s2.length()){return false;}
        for (int i = 0; i < s1Array.length; i++) {
            boolean letraComp = false;
            for (int j = 0; j < s2Array.length; j++) {
                if (s1Array[i] == s2Array[j]){
                    letraComp = true;
                }
            }
            if (!letraComp){return false;}
        }
        for (int i = 0; i < s1Array.length; i++) {
            boolean letraComp = false;
            for (int j = 0; j < s2Array.length; j++) {
                if (s2Array[i] == s1Array[j]){
                    letraComp = true;
                }
            }
            if (!letraComp){return false;}
        }
        return true;
    }
}
