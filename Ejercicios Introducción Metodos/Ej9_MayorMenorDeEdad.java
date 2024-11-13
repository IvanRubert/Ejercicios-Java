import javax.swing.*;

public class Ej9_MayorMenorDeEdad {
    public static void main(String[] args) {
        int edad;

        do {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Enter the age: "));
            if (edad < 0) {
                JOptionPane.showMessageDialog(null, "No puedes tener menos de 0 años", "Error", JOptionPane.ERROR_MESSAGE);
            }
            if (edad > 150) {
                JOptionPane.showMessageDialog(null, "La edad introducida es superior a la maxima soportada por el programa", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (edad < 0 || edad > 150);

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }
}
