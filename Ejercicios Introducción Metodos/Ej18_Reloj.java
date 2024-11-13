import javax.swing.*;

public class Ej18_Reloj {
    public static void main(String[] args) {
        int hora = -1, minutos = -1, segundos = -1;

        while (hora < 0 || hora > 23) {
            try {
                hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce una hora (0 - 23): "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido no esta dentro del rango", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (minutos < 0 || minutos > 59) {
            try {
                minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos (0 - 59): "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido no esta dentro del rango", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (segundos < 0 || segundos > 59) {
            try {
                segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los segundos (0 - 59): "));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido no esta dentro del rango", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            if (hora < 10) {
                System.out.print("0");
            }
            System.out.print(hora + ":");
            if (minutos < 10) {
                System.out.print("0");
            }
            System.out.print(minutos + ":");
            if (segundos < 10) {
                System.out.print("0");
            }
            System.out.println(segundos);

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
