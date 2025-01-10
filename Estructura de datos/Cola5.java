import java.util.LinkedList;
import java.util.Queue;

public class Cola5 {
    public static void main(String[] args) {
        Queue<String> llamadas = new LinkedList<>();
        int contador;
        boolean activado = false;
        for (contador = 1; contador < 4; contador++) {
            llamadas.add("Llamada "+contador);
        }
        System.out.println("Cola de llamadas: "+llamadas);
        while (!llamadas.isEmpty()){
            try {
                Thread.sleep(2000);
                llamadas.poll();
                System.out.println("Cola de llamadas: "+llamadas);
                if (llamadas.size()==1 && !activado){
                    activado = true;
                    for (;contador < 6; contador++) {
                        llamadas.add("Llamada "+contador);
                        Thread.sleep(500);
                        System.out.println("Cola de llamadas: "+llamadas);
                    }

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
