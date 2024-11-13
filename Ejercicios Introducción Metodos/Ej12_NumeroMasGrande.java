import javax.swing.*;

public class Ej12_NumeroMasGrande {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));

        if (num1 < num2) {
            System.out.println(num2 + " es el numero mas grande");
        } else if (num1 > num2) {
            System.out.println(num1 + " es el numero mas grande");
        } else {
            System.out.println("Los dos numeros son iguales");
        }
    }
}
