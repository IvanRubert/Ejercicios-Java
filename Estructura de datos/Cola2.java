import java.util.LinkedList;
import java.util.Queue;

public class Cola2 {
    public static void main(String[] args) {
        Queue<String> colaImpresion = new LinkedList<>();
        for (int i = 1; i < 8; i++) {
            colaImpresion.add("Impresion "+i);
        }
        System.out.println(colaImpresion);
        while (!colaImpresion.isEmpty()){
            try {
                Thread.sleep(3000);
                colaImpresion.poll();
                System.out.println(colaImpresion);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
