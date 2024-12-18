import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] parking = new int[10];
        parking[0] = 101;
        parking[1] = 102;
        parking[2] = 103;
        entraCoche(104, parking);
        mostrarCoches(parking);
        saleCoche(102, parking);
        mostrarCoches(parking);
    }

    private static void mostrarCoches(int[] parking) {
        System.out.println("Lista de coches");
        System.out.println("******************");
        for (int matricula : parking){
            System.out.print(matricula+"  ");
        }
        System.out.println();
    }

    private static void entraCoche(int matricula, int[] parking){
        int temp = parking[0];
        parking[0] = matricula;

        for (int i = 1; i < parking.length-1; i++) {
            int temp2 = parking[i];
            parking[i] = temp;
            temp = temp2;
        }
    }

    private static void saleCoche(int matricula, int[] parking) {
        int pos = 0;
        for (int i = 0; i < parking.length; i++) {
            if (parking[i] == matricula){
                pos = i;
            }
        }
        int temp = parking[parking.length-1];
        for (int i = parking.length-1; i > pos; i--) {
            int temp2 = parking[i-1];
            parking[i-1] = temp;
            temp = temp2;
        }
    }
}
