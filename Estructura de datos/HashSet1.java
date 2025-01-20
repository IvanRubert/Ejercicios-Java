import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSet1 {
    public static void main(String[] args) {
        Set<Integer> numList = new HashSet<>();
        Scanner input = new Scanner(System.in);

        System.out.print("¿Cuantos numeros vas a introducir? ");
        int numRep = input.nextInt();
        for (int i = 1; i <= numRep; i++) {
            System.out.println("Introduce un numero ("+i+"-"+numRep+"): ");
            numList.add(input.nextInt());
        }

        numList = incrementoHasSet(numList);

        System.out.println(numList);
    }

    private static Set<Integer> incrementoHasSet(Set<Integer> numList) {
        Set<Integer> listTemp = new HashSet<>();
        Iterator<Integer> it = numList.iterator();
        while (it.hasNext()){
            listTemp.add(it.next()+1);
        }
        return listTemp;
    }
}
