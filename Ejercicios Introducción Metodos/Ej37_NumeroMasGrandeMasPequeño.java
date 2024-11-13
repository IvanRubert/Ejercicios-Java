import javax.swing.*;

public class Ej37_NumeroMasGrandeMasPequeño {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int numMasGrande = 0, numMasPequeno = 0;

        for (int i = 0; i <= nums.length - 1; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número (" + (i+1) + "-10): "));
        }
        for (int j = 0; j <= nums.length - 1; j++) {
            if(j == 0) {
                numMasGrande = nums[j];
                numMasPequeno = nums[j];
                continue;
            }
            if (numMasGrande < nums[j]){
                numMasGrande = nums[j];
            }
            if (numMasPequeno > nums [j]) {
                numMasPequeno = nums[j];
            }
        }
        System.out.println("El número mas grande es el " + numMasGrande);
        System.out.println("El número mas pequeño es el " + numMasPequeno);
    }
}
