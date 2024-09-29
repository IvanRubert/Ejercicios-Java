import javax.swing.*;

public class Ej1_Dividir_SumarAlFinal {
    public static void main(String[] args) {
        double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Introduce el dividendo: "));
        double divisor = Double.parseDouble(JOptionPane.showInputDialog("Introduce el divisor: "));
        double sumarAlFinal = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número a sumar: "));

        if (divisor != 0) System.out.println((dividendo / divisor) + sumarAlFinal);
        else System.out.println("No se puede dividir entre 0");
    }
}
