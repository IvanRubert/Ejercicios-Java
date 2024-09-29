import javax.swing.*;

public class Ej34_CalcularDNI {
    public static void main(String[] args) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraInicial;
        byte numInicial = -1;

        do {
            letraInicial = JOptionPane.showInputDialog("Introduce la letra inicial de tu NIE: ").toUpperCase().charAt(0);
            switch (letraInicial) {
                case 'X':
                    numInicial = 0;
                    break;
                case 'Y':
                    numInicial = 1;
                    break;
                case 'Z':
                    numInicial = 2;
                    break;
                default:
                    System.out.println("Error. Letra incorrecta.");
            }
        } while (numInicial == -1);

        int numNIE = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de tu NIE: "));
        int numDNI = Integer.parseInt(String.valueOf(numInicial) + numNIE);
        int pos = numDNI % 23;

        System.out.println("Tu NIE es: " + letraInicial + numNIE + letrasDNI[pos]);
    }
}