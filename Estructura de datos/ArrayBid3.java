public class ArrayBid3 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrizTraspuesta = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        for (int[] fila : matrizTraspuesta){
            for (int num : fila){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}
