import javax.swing.*;

public class Ej24_NotaMedia {
    public static void main(String[] args) {
        int nota = 0;
        int sum = 0;
        int contador = 0;
        boolean tieneAlgun10 = false;

        while (nota != -1) {
            nota = Integer.parseInt(JOptionPane.showInputDialog("Introduce una nota (-1 para salir): "));
            if (nota == -1) {
                System.out.println("Calculando media...");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            } else {
                sum = sum + nota;
                contador++;
                if (nota == 10) {
                    tieneAlgun10 = true;
                }
            }
        }
        System.out.println("Nota media: " + (sum/contador));
        if (tieneAlgun10) {
            System.out.println("Tiene al menos un 10");
        } else System.out.println("No tiene ningun 10");
    }
}
