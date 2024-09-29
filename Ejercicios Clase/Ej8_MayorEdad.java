import javax.swing.*;

public class Ej8_MayorEdad {
    public static void main(String[] args) {
        int edad;

        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Enter the age: "));
            if (edad < 0) {
                JOptionPane.showMessageDialog(null, "No puedes tener una edad negativa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (edad < 0);

        if (edad >= 18) {
            System.out.println("You have the legal age");
        }
    }
}
