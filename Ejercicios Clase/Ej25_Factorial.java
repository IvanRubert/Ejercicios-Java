import javax.swing.*;

public class Ej25_Factorial {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
        int contador;
        long factorial = 1;

        for (contador = num; contador > 1; contador--) {
            factorial = factorial * contador;
        }
        System.out.println(num + "! = " + factorial);
    }
}
