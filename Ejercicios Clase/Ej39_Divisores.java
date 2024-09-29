import javax.swing.*;

public class Ej39_Divisores {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: "));

        System.out.print("Los divisores de " + num + " son: " + num + ", ");
        for (int i = num/2; i >= 2 ; i--) {
            if (num % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println(1);
    }
}
