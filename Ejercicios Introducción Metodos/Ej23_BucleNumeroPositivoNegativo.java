import javax.swing.*;

public class Ej23_BucleNumeroPositivoNegativo {
    public static void main(String[] args) {
        int num = 1;
        while (num != 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("introduce un número (0 para salir): "));
            if (num == 0) {
                System.out.println("Has salido");
            } else if (num < 0) {
                System.out.println("El número " + num + " es negativo");
            } else {
                System.out.println("El número " + num + " es positivo");
            }
        }
    }
}
