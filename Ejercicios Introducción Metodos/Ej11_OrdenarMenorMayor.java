import javax.swing.*;

public class Ej11_OrdenarMenorMayor {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));

        if (num1 < num2) {
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
