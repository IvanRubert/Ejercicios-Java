import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stream5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        List<Integer> lista = new ArrayList<>();
        do {
            System.out.print("Introduce un número (Introduce un número negativo para salir): ");
            num = input.nextInt();
            if (num > 0){
                lista.add(num);
            }
        }while (num > 0);

        lista.stream().
                filter(numero -> numero>=1 && numero<=5).
                forEach(value -> System.out.print(value+" "));
    }
}
