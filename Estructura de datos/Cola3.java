import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class Cola3 {
    public static void main(String[] args) {
        Queue<String> colaPacentes = new LinkedList<>();
        Queue<String> colaUrgencias = new LinkedList<>();
        Queue<String> cola = new LinkedList<>();
        int contador = 1;
        int opcion = -1;
        do {
            if (opcion != -1) {
                if (colaUrgencias.isEmpty()){
                    System.out.println(colaPacentes);
                } else System.out.println(colaUrgencias +""+ colaPacentes);
            }
            opcion = JOptionPane.showOptionDialog(null, "¿Qué quieres hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[]{"Llega paciente","Llega paciente grave", "Atender paciente", "Salir"}, 0);
            switch (opcion) {
                case 0:
                    colaPacentes.add(numeroCola(contador));
                    contador++;
                    break;
                case 1:
                    colaUrgencias.add(numeroCola(contador));
                    contador++;
                    break;
                case 2:
                    if (!colaUrgencias.isEmpty()) {
                        colaUrgencias.poll();
                    } else if (!colaPacentes.isEmpty()){
                        colaPacentes.poll();
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay pacientes a los que atender", "Error", JOptionPane.ERROR_MESSAGE);
                        opcion = -1;
                    }
                    break;
                case 3:
            }
        }while (opcion != 3);
    }

    private static String numeroCola(int num) {
        if (num<10) return "00"+num;
        else if (num<100) return "0"+num;
        else return String.valueOf(num);
    }
}

