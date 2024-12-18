public class Array4 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3};
        for (int i = 0; i < numeros.length-1; i++) {
            int numMin = Integer.MAX_VALUE;
            int posicion = 0;
            for (int j = i; j < numeros.length; j++){
                if (numeros[j] < numMin){numMin = numeros[j];
                posicion = j;}
            }
            int temp = numeros[i];
            numeros[i] = numMin;
            numeros[posicion] = temp;

        }
        for (int num : numeros){
            System.out.println(num);
        }
    }
}
