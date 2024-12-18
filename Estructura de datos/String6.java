import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String s1 = input.nextLine().toLowerCase();
        permutaciones("", s1);

    }

    private static void permutaciones(String prefix, String s) {
        if (s.isEmpty()){
            System.out.println(prefix);
        }else {
            for (int i = 0; i < s.length(); i++) {
                permutaciones(prefix+s.charAt(i), s.substring(0,i)+s.substring(i+1));
            }
        }
    }
}
