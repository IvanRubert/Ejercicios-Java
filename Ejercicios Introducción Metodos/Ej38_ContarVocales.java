import javax.swing.*;

public class Ej38_ContarVocales {
    public static void main(String[] args) {
        //https://www.blackbox.ai/share/4372bea6-75e5-48f0-a676-b8bfe9f82a39
        String vocalesRegex = "[aeiouAEIOU]";
        int contadorVocales = 0;
        String texto = JOptionPane.showInputDialog("Introduce una o más palabras: ");

        for (int i = 0; i <= texto.length() - 1; i++) {
            if (String.valueOf(texto.charAt(i)).matches(vocalesRegex)) {
                contadorVocales++;
            }
        }
        System.out.println("La cadena de texto: " + '"' + texto + '"' + " tiene " + contadorVocales + " vocales");
    }
}