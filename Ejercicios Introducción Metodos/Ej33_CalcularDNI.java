import javax.swing.*;

public class Ej33_CalcularDNI {
    public static void main(String[] args) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        int numDNI = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de tu DNI: "));
        int pos = numDNI % 23;

        System.out.println("Tu DNI es: " + numDNI + letrasDNI[pos]);
    }
}
