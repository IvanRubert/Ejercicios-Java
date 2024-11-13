import javax.swing.*;

public class Ej42_MultiplicacionConSumas {
    public static void main(String[] args) {
        int mult = 0;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));

        for (int i = 1; i <= num2; i++) {
            mult = mult + num1;
        }
        System.out.println("La multiplicacion " + num1 + " * " + num2 + " da como resultado: " + mult);
    }
}
