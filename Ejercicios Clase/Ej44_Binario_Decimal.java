import javax.swing.*;

public class Ej44_Binario_Decimal {
    public static void main(String[] args) {
        String binario = JOptionPane.showInputDialog("Introduce un valor en binario: ");

        int decimal = Integer.parseInt(binario, 2);

        System.out.println("el número binario: " + binario + " es el número decimal " + decimal);
    }
}
