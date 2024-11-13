public class Ej29_Primos3Al100 {
    public static void main(String[] args) {
        boolean numNoPrimo;

        for (int num = 3; num <= 100 ; num++) {
            numNoPrimo = false;
            if (num % 2 == 0){
                continue;
            } else {
                for (int i = num / 2; i > 2; i = i - 2) {
                    if (i % 2 == 0) {i--;}
                    if (num % i == 0) {
                        numNoPrimo = true;
                        break;
                    }
                }
                if (!numNoPrimo) {
                    System.out.println(num);
                }
            }
        }
    }
}
