import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String s = input.nextLine();
        char[] charArray = s.toCharArray();
        String result = "";
        for (int i = 0; i < charArray.length; i++) {
            boolean charRepetido = false;
            if (i != charArray.length-1 && charArray[i] != 32){
                for (int j = i+1; j < charArray.length; j++) {
                    if (charArray[i] == charArray[j]){
                        charRepetido = true;
                    }
                }
            }
            if (!charRepetido){
                result+=charArray[i];
            }
        }
        result = result.trim().replaceAll(" +", " ");
        System.out.println("Cadena original: "+s);
        System.out.println("Cadena sin duplicados: "+result);
    }
}
