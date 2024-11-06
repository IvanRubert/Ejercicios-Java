package Ejercicios_corregidos;

public class Prueba {
    public static void main(String[] args) {
        System.out.println(mayorNum(2));
    }

    private static String mayorNum(int i) {
        if (i > 5){
            return "mayor";
        }
        return "menor";
    }
}
