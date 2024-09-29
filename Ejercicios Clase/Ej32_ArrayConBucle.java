import javax.swing.*;

public class Ej32_ArrayConBucle {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i = 0; i <= nums.length -1; i++) {
            nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));
        }
        for (int j = nums.length - 1; j >= 0 ; j--) {
            System.out.println(nums[j]);
        }
    }
}
