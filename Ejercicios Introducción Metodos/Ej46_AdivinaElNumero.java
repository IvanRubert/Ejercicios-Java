import javax.swing.*;

public class Ej46_AdivinaElNumero {
    public static void main(String[] args) {
        int num;
        int numCorrecto = (int) (Math.random() * (100 - 1 + 1) + 1);
        int intentos = 0;
        System.out.println(numCorrecto);
        do {
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (1-100): "));
            } while (num < -1 || num > 100);
            intentos++;

            if (num == numCorrecto) {
                JOptionPane.showMessageDialog(null, "Has ganado en " + intentos + " intentos", "Resultado", 1);
                break;
            } else if (num == -1) {
                JOptionPane.showMessageDialog(null, "El usuario se ha rendido en " + (intentos - 1) + " intentos", "Se rinde", 1);
            } else if (num > numCorrecto) {
                JOptionPane.showMessageDialog(null, "El número buscado es mas pequeño que el número introducido", "Resultado", 0);
            } else {
                JOptionPane.showMessageDialog(null, "El número buscado es mas grande que el número introducido", "Resultado", 0);
            }

        } while (num != -1);

    }
}
