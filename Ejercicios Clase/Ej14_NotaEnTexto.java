import javax.swing.*;

public class Ej14_NotaEnTexto {
    public static void main(String[] args) {
        float num = Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota: "));

        if (num >= 0 && num < 3) {
            System.out.println("Muy deficiente");
        } else if (num >= 3 && num < 5) {
            System.out.println("Insuficiente");
        } else if (num >= 5 && num < 6) {
            System.out.println("Suficiente");
        } else if (num >= 6 && num < 7) {
            System.out.println("Bien");
        } else if (num >= 7 && num < 9) {
            System.out.println("Notable");
        } else if (num >= 9 && num <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("El valor introducido es incorrecto");
        }
    }
}
