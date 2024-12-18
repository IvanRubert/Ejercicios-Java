public class Array5 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3};
        int par = 0, impar = 0;
        for (int num : numeros){
            if (num % 2 == 0){par++;}
            else{impar++;}
        }
        System.out.println("Hay "+par+" números pares y "+impar+" numeros impares");
    }
}
