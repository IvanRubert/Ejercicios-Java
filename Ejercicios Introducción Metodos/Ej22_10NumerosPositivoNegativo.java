import javax.swing.*;

public class Ej22_10NumerosPositivoNegativo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
            if (num < 0) {
                System.out.println("El número " + num + " es negativo");
            } else {
                System.out.println("El número " + num + " es positivo");
            }
        }
    }
}
