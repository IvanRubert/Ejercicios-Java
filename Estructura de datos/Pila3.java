import javax.swing.JOptionPane;
import java.util.Stack;

public class Pila3 {
    public static void main(String[] args) {
        Stack<String> pilaMetodos = new Stack<>();
        int num;
        do{
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de repeticiones"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un numero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                num = 0;
            }
        }while(num<=0);

        for (int i = 1; i <= num; i++) {
            pilaMetodos.push("Metodo"+i);
        }
        for (String metodo : pilaMetodos){
            System.out.println("Llamada al metodo "+metodo);
        }
        while (!pilaMetodos.isEmpty()){
            System.out.println("Fin del metodo "+pilaMetodos.peek());
            pilaMetodos.pop();
        }
    }
}
