import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int suma = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i <= 10; i++) {
            Random rand = new Random();
            numeros.add(rand.nextInt(1,100));
        }
        for (int num : numeros){
            if (num > max){max = num;}
            if (num < min){min = num;}
            suma += num;
        }
        System.out.println("La suma total es: "+suma);
        System.out.println("El número máximo es: "+max);
        System.out.println("El número minimo es: "+min);
        System.out.println();
        numeros.sort(Comparator.naturalOrder());
        System.out.println("Orden ascendente:");
        for (int num : numeros){
            System.out.print(num+"\t");
        }
        numeros.sort(Comparator.reverseOrder());
        System.out.println("\nOrden descendente:");
        for (int num : numeros){
            System.out.print(num+"\t");
        }
    }
}
