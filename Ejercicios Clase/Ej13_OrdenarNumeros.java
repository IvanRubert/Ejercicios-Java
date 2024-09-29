import javax.swing.*;

public class Ej13_OrdenarNumeros {
    public static void main(String[] args) {
        String[] opciones = {"Ascendente", "Descendente"};
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int orden = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Introduce el orden (asc por defecto): ", "Orden de los valores", 0, 3, null, opciones, 0)));

        if (orden == 1) {
            if (num1 < num2) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        } else {
            if (num1 < num2) {
                System.out.println(num1);
                System.out.println(num2);
            } else {
                System.out.println(num2);
                System.out.println(num1);
            }
        }
    }
}
