import javax.swing.*;

public class Ej21_YearBisiesto {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Introduce un año: "));

        if (year % 400 == 0) {
            System.out.println("El año " + year + " es bisiesto");
        } else if (year % 100 == 0) {
            System.out.println("El año " + year + " no es bisiesto");
        } else if (year % 4 == 0) {
            System.out.println("El año " + year + " es bisiesto");
        } else {
            System.out.println("El año " + year + " no es bisiesto");
        }
    }
}
