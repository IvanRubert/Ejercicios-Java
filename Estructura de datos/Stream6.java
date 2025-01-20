import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Stream6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Persona> lista = new ArrayList<>();
        String nombre, apellido;
        int year;
        do {
            System.out.print("Introduce el nombre de la persona (No introduzcas nada para salir): ");
            nombre = input.nextLine();
            if (!nombre.isEmpty()){
                System.out.print("Introduce el apellido de "+nombre+": ");
                apellido = input.nextLine();
                System.out.print("Introduce el año de nacimiento de "+nombre+": ");
                year = input.nextInt();
                input.nextLine();
                lista.add(new Persona(nombre, apellido, year));
            }
        }while (!nombre.isEmpty());

        new HashSet<>(lista).stream().
                forEach(values -> System.out.println(values.getApellido()));
    }
}
