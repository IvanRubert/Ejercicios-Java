import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String s = input.nextLine();
        char[] charArray = s.toCharArray();
        String sCompr = "";
        char temp = '-';
        for (int i = 0; i < charArray.length; i++) {
            int contador = 1;
            boolean repetido = temp == charArray[i];
            if (i == charArray.length-1 || repetido){
            }else {
                for (int j = i+1; j < charArray.length ; j++){
                    if (charArray[i] == charArray[j]) {
                        contador++;
                    }
                }
            }
            temp = charArray[i];
            if (!repetido) {
                if (charArray[i] == 32) {
                    sCompr += ' ';
                } else {
                    sCompr += charArray[i] + "" + contador;
                }
            }
        }
        if (s.length() < sCompr.length()){
            System.out.println(s);
        }else {
            System.out.println(sCompr);
        }
    }
}
