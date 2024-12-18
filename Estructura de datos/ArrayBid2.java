public class ArrayBid2 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        int suma = 0;
        for (int[] fila : matriz){
            for (int num : fila){
                suma += num;
            }
        }
        System.out.println("La suma de los números de la matriz es: "+suma);
    }
}
