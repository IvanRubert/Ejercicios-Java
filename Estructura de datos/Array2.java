public class Array2 {
    public static void main(String[] args) {
        int[] numeros = {3,5,7,2,8};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma+=numeros[i];
        }
        System.out.println("La suma es: "+suma);
    }
}
