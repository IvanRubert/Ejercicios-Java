import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<Double>();
        double promedio = 0;
        int mayores = 0, menores = 0;
        notas.add(2.4);
        notas.add(4.99);
        notas.add(6.01);
        notas.add(10d);
        notas.add(7.36);
        notas.add(2.28);
        notas.add(8.12);
        notas.add(7d);
        notas.add(9d);
        notas.add(3d);
        for (double nota : notas){
            if (nota < 5){menores++;}
            else {mayores++;}
            promedio+=nota;
        }
        promedio/=notas.size();
        System.out.println("La nota promedio es: "+promedio+"\nHay "+menores+" notas que están por debajo de 5 y "+mayores+" que están por encima");
        notas.sort(Comparator.naturalOrder());
        notas.removeFirst();
        notas.removeLast();
        System.out.println(notas);
    }
}
