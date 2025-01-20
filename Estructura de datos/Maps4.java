import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Maps4 {
    public static void main(String[] args) {
        ArrayList<Integer> termNum = new ArrayList<>();
        Map<Integer, Integer> terminaciones = new TreeMap<>();
        int numRep;
        String num;
        do {
            try {
                numRep = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el número de repeticiones"));
            } catch (NumberFormatException e) {
                numRep = -1;
            }
            if (numRep <= 0){
                JOptionPane.showMessageDialog(null, "Introduce un número válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } while (numRep <= 0);
        for (int i = 0; i < numRep; i++) {
            do {
                num = JOptionPane.showInputDialog(null, "Introduce un número");
                if (num == null || !num.matches("[0-9]+")){
                    num = "a";
                    JOptionPane.showMessageDialog(null, "Introduce un número positivo", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }while (num.equals("a"));
            termNum.add(Integer.parseInt(String.valueOf(num.charAt(num.length()-1))));
        }
        termNum.sort(Comparator.naturalOrder());
        int contador = 0;
        while (contador<termNum.size()){
            numRep = 1;
            int valor = termNum.get(contador);
            if (contador != termNum.size()-1){
                for (int i = contador+1; i < termNum.size(); i++) {
                    if (valor == termNum.get(i)){numRep++;}
                }
            }
            terminaciones.put(valor, numRep);
            contador+=numRep;
        }
        JOptionPane.showMessageDialog(null, terminaciones);
    }
}
