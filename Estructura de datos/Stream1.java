import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stream1 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Paco", "Alvarez", 2000));
        lista.add(new Persona("Pepe", "Perez", 1970));
        lista.add(new Persona("Ana", "Alonso", 2015));
        lista.add(new Persona("Amparo", "Garcia", 1986));

        for (Persona p:lista){
            System.out.println("· "+p.getNombre());
        }
        System.out.print("Introduce el nombre de quien quieres buscar: ");
        String p = new Scanner(System.in).nextLine();
        Persona filtro = lista.stream().
                filter(elem -> elem.getNombre().equals(p)).
                findFirst().get();

        System.out.println(filtro.getNombre()+" nacio en el "+filtro.getYearNacimiento());
    }
}