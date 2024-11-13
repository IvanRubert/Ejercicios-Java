import javax.swing.*;

public class Ej43_RestoConRestas {
    public static void main(String[] args) {
        int dividendo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo: "));
        int divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor: "));

        while (dividendo >= divisor) {
            dividendo -= divisor;
        }
        System.out.println("El resto es: " + dividendo);
    }
}
