import javax.swing.*;

public class Ej28_NumeroPrimo {
    public static void main(String[] args) {
        boolean numNoPrimo = false;
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

        if (num == 2){
            System.out.println("El número " + num + " es primo");
        } else if (num % 2 == 0){
            System.out.println("El número " + num + " no es primo");
        } else {
            for (int i = num / 2; i > 2; i = i - 2) {
                if (i % 2 == 0) {i--;}
                if (num % i == 0) {
                    numNoPrimo = true;
                    break;
                }
            }
            if (numNoPrimo) {
                System.out.println("El número " + num + " no es primo");
            } else System.out.println("El número " + num + " es primo");
        }
    }
}
