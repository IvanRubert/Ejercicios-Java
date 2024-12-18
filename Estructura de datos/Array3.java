public class Array3 {
    public static void main(String[] args) {
        int[] numeros = {3, 5, 7, 2, 8};
        int numMin = Integer.MAX_VALUE;
        int numMax = Integer.MIN_VALUE;
        for (int num : numeros){
            if (num < numMin){numMin = num;}
            if (num > numMax){numMax = num;}
        }
        System.out.println("Número máxino: "+numMax+"\nNúmero minimo: "+numMin);
    }
}
