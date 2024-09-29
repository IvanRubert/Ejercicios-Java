import javax.swing.*;
import java.util.ArrayList;

public class Ej35_NotaMediaConArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> notaList = new ArrayList<Integer>();
        int nota = 0;
        int sum = 0;
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
                notaList.add(nota);
            }
        }

        if (notaList.toArray().length == 0) {
            System.out.println("No se ha introducido ninguna nota");
        } else {
            for (int i = 0; i <= notaList.toArray().length - 1; i++) {
                sum = sum + notaList.get(i);
                if (notaList.get(i) == 10) {
                    tieneAlgun10 = true;
                }
            }

            System.out.println("Nota media: " + (sum/notaList.toArray().length));
            if (tieneAlgun10) {
                System.out.println("Tiene al menos un 10");
            } else System.out.println("No tiene ningun 10");
        }

    }
}
