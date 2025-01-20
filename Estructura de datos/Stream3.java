import java.util.ArrayList;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Paco", "Alvarez", 2000));
        lista.add(new Persona("Pepe", "Perez", 1970));
        lista.add(new Persona("Ana", "Alonso", 2015));
        lista.add(new Persona("Amparo", "Garcia", 1986));
        lista.add(new Persona("Amparo", "Diaz", 1960));

        lista.stream().
                map(Persona::getNombre).
                distinct().sorted().forEach(value -> System.out.println("· "+value));
    }
}
