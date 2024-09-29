import javax.swing.*;

public class Ej5_SumaRestaMultipDivision {
    public static void main(String[] args) {
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 1: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 2: "));

        float suma = num1 + num2;
        float resta = num1 - num2;
        float multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            float division = num1 / num2;
            System.out.println("División: " + division);
        }
    }
}
