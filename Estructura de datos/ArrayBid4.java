public class ArrayBid4 {
    public static void main(String[] args) {
        int[][] matriz = {{4,5,6},{1,2,3},{7,8,9}};
        int max = Integer.MIN_VALUE;
        for (int[] fila : matriz){
            for (int num : fila){
                if (num > max){
                    max = num;
                }
            }
        }
        System.out.println("El numero mas grande de la matriz es: "+max);
    }
}
