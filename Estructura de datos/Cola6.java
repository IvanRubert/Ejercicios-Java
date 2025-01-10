import java.util.LinkedList;
import java.util.Queue;

public class Cola6 {
    public static void main(String[] args) {
        Queue<String> colaAutobus = new LinkedList<>();
        int contador;
        boolean activado = false;
        for (contador = 1; contador < 4; contador++) {
            colaAutobus.add(numeroCola(contador));
        }
        System.out.println("Cola del autobus: "+colaAutobus);
        while (!colaAutobus.isEmpty()){
            try {
                Thread.sleep(2000);
                colaAutobus.poll();
                System.out.println("Cola del autobus: "+colaAutobus);
                if (colaAutobus.size()==1 && !activado){
                    activado = true;
                    for (;contador < 6; contador++) {
                        colaAutobus.add(numeroCola(contador));
                        Thread.sleep(500);
                        System.out.println("Cola del autobus: "+colaAutobus);
                    }

                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static String numeroCola(int num) {
        if (num<10) return "00"+num;
        else if (num<100) return "0"+num;
        else return String.valueOf(num);
    }
}
