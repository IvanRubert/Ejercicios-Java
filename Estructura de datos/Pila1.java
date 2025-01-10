import javax.swing.JOptionPane;
import java.util.Stack;

public class Pila1 {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        int opcion;
        do {
            JOptionPane.showMessageDialog(null, historial.isEmpty()?"Página principal":historial.peek(), "Página actual", JOptionPane.INFORMATION_MESSAGE);
            opcion = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Navegar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Atras", "Nueva página", "Salir"}, 0);
            switch (opcion){
                case 0:
                    if (!historial.isEmpty()){
                        historial.pop();
                    }else {
                        JOptionPane.showMessageDialog(null, "No hay paginas en el historial","Error", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 1:
                    historial.push(JOptionPane.showInputDialog("Introduce la página a la que vas a acceder"));
                    break;
                case 2:
            }
        }while (opcion != 2);
    }
}
