import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Maps5 {
    public static void main(String[] args) {
        ArrayList<String> termList = new ArrayList<>();
        Map<String, Integer> palabrasMap = new TreeMap<>();
        int numRep;
        String num = "a";
        while (num != null && !num.isEmpty()){
            num = JOptionPane.showInputDialog(null, "Introduce un número");
            if (num != null && !num.isEmpty()) {
                termList.add(num);
            }
        }
        termList.sort(Comparator.naturalOrder());
        int contador = 0;
        while (contador<termList.size()){
            numRep = 1;
            String valor = termList.get(contador);
            if (contador != termList.size()-1){
                for (int i = contador+1; i < termList.size(); i++) {
                    if (valor.equals(termList.get(i))){numRep++;}
                }
            }
            palabrasMap.put(valor, numRep);
            contador+=numRep;
        }
        JOptionPane.showMessageDialog(null, palabrasMap);
    }
}
