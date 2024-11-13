import javax.swing.*;

public class Ej10_PositivoNegativo {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));

        if (num >= 0) {
            System.out.println("El numero " + num + " es positivo");
        } else {
            System.out.println("El numero " + num + " es negativo");
        }
    }
}
