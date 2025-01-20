import java.util.HashMap;
import java.util.Scanner;

public class Maps1 {
    public static void main(String[] args) {
        HashMap<String, String> paisCapital = new HashMap<>();
        Scanner input = new Scanner(System.in);
        paisCapital.put("España", "Madrid");
        paisCapital.put("Francia", "París");
        paisCapital.put("Alemania", "Berlín");
        paisCapital.put("Paises bajos", "Amsterdam");

        System.out.print("Introduce un pais: ");
        String key = input.nextLine();
        System.out.println("Capital de "+key+": "+paisCapital.getOrDefault(key, "No existe en la lista el pais "+key));

    }
}
