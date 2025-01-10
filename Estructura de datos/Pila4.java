import java.util.Stack;

public class Pila4 {
    public static void main(String[] args) {
        Stack<String> platos = new Stack<>();
        for (int i = 1; i <= 20; i++) {
            platos.push("Plato "+i);
        }
        while (!platos.isEmpty()){
            System.out.println("El camarero ha cogido el plato: "+platos.peek());
            platos.pop();
        }
    }
}
