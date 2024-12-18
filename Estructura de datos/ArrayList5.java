import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<Integer> colaPersonas = new ArrayList<Integer>();
        colaPersonas.add(1);
        colaPersonas.add(2);
        colaPersonas.add(3);
        colaPersonas.add(4);
        colaPersonas.add(5);
        System.out.println("Cola de espera\n*****************\n"+colaPersonas);
        colaPersonas.removeFirst();
        colaPersonas.add(6);
        colaPersonas.removeFirst();
        System.out.println("Cola de espera\n*****************\n"+colaPersonas);
    }
}
