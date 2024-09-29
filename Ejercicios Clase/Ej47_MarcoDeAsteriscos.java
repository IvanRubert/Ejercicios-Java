import javax.swing.*;

public class Ej47_MarcoDeAsteriscos {
    public static void main(String[] args) {
        String[] cadenaTexto = new String[5];
        int longitud = 0;
        String espacio = " ";

        for (int i = 0; i < cadenaTexto.length; i++) {
            cadenaTexto[i] = JOptionPane.showInputDialog("Introduce una palabra (" + i + "-5): ");
            if (cadenaTexto[i].length() > longitud) {
                longitud = cadenaTexto[i].length();
            }
        }

        lineaAsteriscos(longitud);
        for (String j : cadenaTexto) {
            int espacioQueFalta = longitud - j.length();
            System.out.println("* " + j + espacio.repeat(espacioQueFalta + 1) + "*");
        }
        lineaAsteriscos(longitud);
    }

    private static void lineaAsteriscos(int longitud) {
        for (int contador = 0; contador < longitud + 4; contador++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
