import java.util.Scanner;

public class Ej4_AreaCuadradoConScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float ladoCuadrado;

        do {
            System.out.print("Introduce el lado del cuadrado: ");
            ladoCuadrado = scanner.nextFloat();
            if (ladoCuadrado < 0) {
                System.out.println("Error. El lado de un cuadrado no puede ser negativo. \n");
            }
        } while (ladoCuadrado < 0);
        float areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("El area del cuadrado de lado " + ladoCuadrado + " es: " + areaCuadrado);
    }
}
