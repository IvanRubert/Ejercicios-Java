import java.util.HashMap;
import java.util.Scanner;

public class Maps2 {
    public static void main(String[] args) {
        HashMap<String, String> guiaTel = new HashMap<>();
        Scanner input  = new Scanner(System.in);
        guiaTel.put("Ivan", "123456789");
        guiaTel.put("Pepe", "456789123");
        guiaTel.put("Alberto", "789123456");
        guiaTel.put("Paco", "123789456");

        System.out.print("Intoduce un nombre "+guiaTel.keySet()+": ");
        String key = input.nextLine();

        System.out.println("Telefono de "+key+": "+guiaTel.getOrDefault(key, "Error. "+key+" no se encuentra en la guia"));
    }
}
