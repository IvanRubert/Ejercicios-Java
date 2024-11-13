public class Ej40_Fibonacci {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1, temp;

        System.out.println("Números de Fibonacci: ");
        System.out.print("1, 1");
        for (int i = 3; i <= 40; i++) {
            temp = n1 + n2;
            System.out.print(", " + temp);
            n1 = n2;
            n2 = temp;
        }
    }
}
