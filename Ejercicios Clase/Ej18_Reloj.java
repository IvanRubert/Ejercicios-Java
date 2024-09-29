import javax.swing.*;

public class Ej18_Reloj {
    public static void main(String[] args) {
        int hora = -1, minutos = -1, segundos = -1;

        while (hora < 0 || hora > 23) {
            hora = Integer.parseInt(JOptionPane.showInputDialog("Introduce una hora (0 - 23): "));
        }
        while (minutos < 0 || minutos > 59) {
            minutos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los minutos (0 - 59): "));
        }
        while (segundos < 0 || segundos > 59) {
            segundos = Integer.parseInt(JOptionPane.showInputDialog("Introduce los segundos (0 - 59): "));
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
