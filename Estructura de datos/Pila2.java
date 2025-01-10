import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Stack;

public class Pila2 {
    public static void main(String[] args) {
        Stack<String> deshacer = new Stack<>();
        Stack<String> rehacer = new Stack<>();
        ArrayList<String> texto = new ArrayList<>();
        int opcion = -1;
        do {
            if (opcion != -1){
                for (String s : texto){
                    System.out.print(s+" ");
                }
                System.out.println();
            }
            opcion = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Deshacer", "Rehacer", "Escribir", "Salir"}, 0);
            switch (opcion){
                case 0:
                    if (!deshacer.isEmpty()){
                        rehacer.push(deshacer.peek());
                        texto.removeLast();
                        deshacer.pop();
                    }else {
                        JOptionPane.showMessageDialog(null, "No se puede deshacer mas", "Error", JOptionPane.ERROR_MESSAGE);
                        opcion = -1;
                    }
                    break;
                case 1:
                    if (!rehacer.isEmpty()){
                        deshacer.push(rehacer.peek());
                        texto.add(rehacer.peek());
                        rehacer.pop();
                    }else {
                        JOptionPane.showMessageDialog(null, "No se puede rehacer mas", "Error", JOptionPane.ERROR_MESSAGE);
                        opcion = -1;
                    }
                    break;
                case 2:
                    String newtexto = JOptionPane.showInputDialog("Introduce texto:");
                    if (!rehacer.isEmpty()){rehacer.clear();}
                    deshacer.push(newtexto);
                    texto.add(newtexto);
                    break;
                case 3:
                    System.out.println();
                    break;
            }
        }while (opcion != 3);
    }
}
