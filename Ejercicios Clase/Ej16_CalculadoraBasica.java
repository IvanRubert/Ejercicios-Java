import javax.swing.*;

public class Ej16_CalculadoraBasica {
    public static void main(String[] args) {
        String[] operadores = {"+", "-", "*", "/"};
        float num1, num2;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer numero: "));
        int opcion = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Que operacion quieres hacer", "Operador", 0, 3, null, operadores, 0)));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el segundo numero: "));

        switch (opcion) {
            case 0:
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case 1:
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case 2:
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case 3:
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero", "Error", JOptionPane.ERROR_MESSAGE);
                }else {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "La opción es incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }

    }
}
