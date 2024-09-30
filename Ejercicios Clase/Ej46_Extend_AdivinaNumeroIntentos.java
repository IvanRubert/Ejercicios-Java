import javax.swing.*;

public class Ej46_Extend_AdivinaNumeroIntentos {
    public static void main(String[] args) {
        int num;
        int numCorrecto = (int) (Math.random() * (100 - 1 + 1) + 1);
        int intentos = 0;
        JOptionPane.showMessageDialog(null, "Encuentra el número en 5 intentos: ", "Número random", 1);
        do {
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (1-100): "));
            } while (num < -1 || num > 100 || num == 0);
            intentos++;

            if (num == numCorrecto) {
                JOptionPane.showMessageDialog(null, "Has ganado en " + intentos + " intentos", "Resultado", 1);
                break;
            } else if (num == -1) {
                JOptionPane.showMessageDialog(null, "El usuario se ha rendido en " + (intentos - 1) + " intentos", "Se rinde", 1);
                break;
            } else if (num > numCorrecto) {
                JOptionPane.showMessageDialog(null, "El número buscado es mas pequeño que el número introducido", "Resultado", 0);
            } else {
                JOptionPane.showMessageDialog(null, "El número buscado es mas grande que el número introducido", "Resultado", 0);
            }

            if (intentos == 3) {
                int opcion = (int) (Math.random() * 2);
                if (opcion == 0) {
                    JOptionPane.showMessageDialog(null, "El numero tiene " + (String.valueOf(numCorrecto).length()) + " digitos", "Pista", 1);
                } else if (opcion == 1) {
                    JOptionPane.showMessageDialog(null, "El ultimo digito es el " + (String.valueOf(numCorrecto).charAt(String.valueOf(numCorrecto).length() - 1)), "Pista", 1);
                }
            }
            if (intentos == 5) {
                JOptionPane.showMessageDialog(null, "Has perdido. El numero era: " + numCorrecto, "Has perdido", 0);
            }
        } while (intentos < 5);
    }
}
