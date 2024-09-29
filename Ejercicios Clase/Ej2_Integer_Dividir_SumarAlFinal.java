import javax.swing.*;

public class Ej2_Integer_Dividir_SumarAlFinal {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo: "));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor: "));
        int sumarAlFinal = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número a sumar: "));

        if (divisor != 0) System.out.println((dividendo / divisor) + sumarAlFinal);
        else System.out.println("No se puede dividir entre 0");
    }
}
