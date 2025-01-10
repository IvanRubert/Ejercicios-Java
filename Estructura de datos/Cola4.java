import java.util.LinkedList;
import java.util.Queue;

public class Cola4 {
    public static void main(String[] args) {
        Queue<String> pedidos = new LinkedList<>();
        int num = 1;
        pedidos.add(numeroPedido(num));
        num++;
        System.out.println("Pedidos: "+pedidos);
        while (num <= 10){
            try {
                Thread.sleep(2000);
                pedidos.add(numeroPedido(num));
                num++;
                System.out.println("Pedidos: "+pedidos);
                Thread.sleep(2000);
                pedidos.poll();
                System.out.println("Pedidos: "+pedidos);
                Thread.sleep(2000);
                pedidos.add(numeroPedido(num));
                num++;
                System.out.println("Pedidos: "+pedidos);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        while (!pedidos.isEmpty()){
            try {
                Thread.sleep(2000);
                pedidos.poll();
                System.out.println("Pedidos: "+pedidos);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private static String numeroPedido(int num) {
        if (num<10) return "00"+num;
        else if (num<100) return "0"+num;
        else return String.valueOf(num);
    }
}
