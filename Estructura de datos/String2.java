import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("¿Que palabra quieres rotar? ");
        String s = input.nextLine();
        System.out.print("¿Cuantas posiciones quieres rotar la cadena? ");
        int posRot = input.nextInt();

        if (s.length() < posRot){
            System.out.println("El desplazamiento excede la longitud de la cadena de caracteres");
        }else {
            String parteFinal = s.substring(s.length() - posRot);
            String partePrincipio = s.substring(0, s.length() - posRot);
            System.out.println(parteFinal+partePrincipio);
        }
    }
}
