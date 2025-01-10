import javax.swing.JOptionPane;
import java.util.Stack;

public class Pila6 {
    public static void main(String[] args) {
        Stack<Integer> binario = new Stack<>();
        int num;
        do{
            try {
                num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debes introducir un numero positivo", "Error", JOptionPane.ERROR_MESSAGE);
                num = -1;
            }
        }while(num<0);

        int decimal = num;
        while (num!=1 && num!=0){
            binario.push(num%2);
            num/=2;
        }
        binario.push(num);
        while (!binario.isEmpty()){
            System.out.print(binario.peek());
            binario.pop();
        }

    }
}
