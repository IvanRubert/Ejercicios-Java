import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stream4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        List<String> lista = new ArrayList<>();
        do {
            System.out.print("Introduce palabras (No introduzcas nada para salir): ");
            s = input.nextLine();
            if (!s.isEmpty()){
                lista.add(s);
            }
        }while (!s.isEmpty());

        lista.stream().forEach(value -> System.out.print(value+" "));
    }
}
