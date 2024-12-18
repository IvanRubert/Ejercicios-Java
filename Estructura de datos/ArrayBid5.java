public class ArrayBid5 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        int[] diagonal = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j){
                    diagonal[i] = matriz[i][j];
                }
            }
        }

        System.out.println("La diagonal principal tiene estos valores:");
        for (int i = 0; i < diagonal.length; i++){
            System.out.println("Posicion ("+i+", "+i+") = "+diagonal[i]);
        }
    }
}
