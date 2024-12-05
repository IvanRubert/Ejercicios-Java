import javax.swing.*;

public class MainPassword {
    public static void main(String[] args) {
        int numPasswords = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array:"));
        Password[] arrayPasswords = new Password[numPasswords];
        Boolean[] arraySeguro = new Boolean[numPasswords];
        for (int i = 0; i < numPasswords; i++) {
            int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce la longitud para la contraseña "+(i+1)));
            arrayPasswords[i] = new Password(longitud);
            arraySeguro[i] = arrayPasswords[i].esFuerte();
        }
        for (int i = 0; i < arrayPasswords.length; i++) {
            System.out.println(arrayPasswords[i].getPassword()+" "+arraySeguro[i]);
        }
    }
}
