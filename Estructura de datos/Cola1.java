import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.util.Queue;

public class Cola1 {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        int contador = 1;
        int opcion = -1;
        do {
            if (opcion != -1) System.out.println(filaBanco);
            opcion = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Llega cliente", "Atender cliente", "Salir"}, 0);
            switch (opcion){
                case 0:
                    if (contador<10){
                        filaBanco.add("00"+contador);
                    } else if (contador<100) {
                        filaBanco.add("0"+contador);
                    }else filaBanco.add(String.valueOf(contador));
                    contador++;
                    break;
                case 1:
                    filaBanco.poll();
                    break;
                case 2:

            }
            }while (opcion != 2);
    }
}
