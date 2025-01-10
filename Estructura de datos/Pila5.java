import java.util.Stack;

public class Pila5 {
    public static void main(String[] args) {
        Stack<String> pilaRopa = new Stack<>();
        for (int i = 1; i <= 15; i++) {
            pilaRopa.push("Ropa "+i);
        }
        while (!pilaRopa.isEmpty()){
            System.out.println("Se ha cogido: "+pilaRopa.peek());
            pilaRopa.pop();
        }
    }
}
