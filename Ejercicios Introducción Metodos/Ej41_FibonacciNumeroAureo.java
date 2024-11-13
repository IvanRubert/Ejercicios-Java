public class Ej41_FibonacciNumeroAureo {
    public static void main(String[] args) {
        //https://chuidiang.org/index.php?title=Caracteres_especiales_para_printf
        int n1 = 1, n2 = 1, temp;
        float numAureo;

        System.out.println("Números de Fibonacci \t Numero Aureo");
        System.out.printf("1 \t\t\t\t\t\t ∞ %n1 \t\t\t\t\t\t 1 %n");
        for (int i = 3; i <= 40; i++) {
            temp = n1 + n2;
            numAureo = (float) n2 /n1;
            System.out.printf(temp + " \t\t\t\t\t\t " + numAureo + "%n");
            n1 = n2;
            n2 = temp;
        }
    }
}
