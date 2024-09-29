import javax.swing.*;

public class Ej26_TablaMultiplicar {
    public static void main(String[] args) {
        int contador;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));
        int tabla = Integer.parseInt(JOptionPane.showInputDialog("Introduce hasta que numero es la tabla de multiplicar: "));

        for (contador = 1; contador <= tabla; contador++) {
            System.out.println(num + " * " + contador + " = " + (num * contador));
        }
    }
}
