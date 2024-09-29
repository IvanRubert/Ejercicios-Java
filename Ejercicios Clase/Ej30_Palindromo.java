import javax.swing.*;

public class Ej30_Palindromo {
    public static void main(String[] args) {
        String cadenaTexto = JOptionPane.showInputDialog("Introduce una palabra o frase: ");
        String cadenaInvertida = "";
        String cadenaSinEspacios = cadenaTexto.replace(" ", "").toLowerCase();

            for (int i = cadenaSinEspacios.length() - 1; i >= 0 ; i--) {
                cadenaInvertida += cadenaSinEspacios.charAt(i);
            }

        if (cadenaSinEspacios.equals(cadenaInvertida)) {
            System.out.println('"' + cadenaTexto + '"' + " es un palíndromo");
        } else System.out.println('"' + cadenaTexto + '"' + " no es un palíndromo");
    }
}
