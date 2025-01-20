import java.util.ArrayList;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Paco", "Alvarez", 2000));
        lista.add(new Persona("Pepe", "Perez", 1970));
        lista.add(new Persona("Ana", "Alonso", 2015));
        lista.add(new Persona("Amparo", "Garcia", 1986));

        List<Persona> listaFiltrada = lista.stream().
                filter(elem -> elem.getApellido().matches("A.*")).
                toList();
        System.out.println("Lista de personas que sus apellidos empiezan por A:");
        for (Persona p:listaFiltrada){
            System.out.println("· "+p.getNombre());
        }
    }
}