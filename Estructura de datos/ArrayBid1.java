public class ArrayBid1 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        for (int[] fila : matriz){
            for (int num : fila){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}
