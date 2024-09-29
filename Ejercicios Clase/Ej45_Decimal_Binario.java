import javax.swing.*;

public class Ej45_Decimal_Binario {
    public static void main(String[] args) {
        int decimal;

        do {
            decimal = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor en decimal (0-255): "));
        } while (decimal > 255 || decimal < 0);


        String binario = Integer.toBinaryString(decimal);

        System.out.println("el número decimal: " + decimal + " es el número binario " + binario);
    }
}
