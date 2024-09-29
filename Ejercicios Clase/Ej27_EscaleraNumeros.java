import javax.swing.*;

public class Ej27_EscaleraNumeros {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("introduce un número: "));

        for (int contador = 1; contador <= num; contador++) {
            for (int i = 1; i <= contador; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
