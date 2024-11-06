public class SumaBinario {
    public static void main(String[] args) {
        String bin1, bin2, res;
        do {
            bin1 = Utilidades.leerCadenaNextLine("Introduce el primer numero binario");
        } while (!bin1.matches("[01]+"));
        do {
            bin2 = Utilidades.leerCadenaNextLine("Introduce el segundo numero binario");
        } while (!bin2.matches("[01]+"));

        res = sumaBinario(bin1, bin2);
        System.out.println(res);
    }

    private static String sumaBinario(String b1, String b2) {
        int temp = 0;
        String res = "";
        if (b1.length() > b2.length()){
            b2 = "0".repeat(b1.length()-b2.length()) + b2;
        } else if (b1.length() < b2.length()) {
            b1 = "0".repeat(b2.length()-b1.length()) + b1;
        }

        for (int i = b1.length()-1; i >= 0; i--) {
            if (b1.charAt(i) == '0' && b2.charAt(i) == '0' && temp == 0) {
                res = "0" + res;
                temp = 0;
            } else if ((b1.charAt(i) == '1' && b2.charAt(i) == '0' && temp == 0) ||
                    (b1.charAt(i) == '0' && b2.charAt(i) == '1' && temp == 0) ||
                    (b1.charAt(i) == '0' && b2.charAt(i) == '0' && temp == 1)) {
                res = "1" + res;
                temp = 0;
            } else if ((b1.charAt(i) == '1' && b2.charAt(i) == '1' && temp == 0) ||
                    (b1.charAt(i) == '1' && b2.charAt(i) == '0' && temp == 1) ||
                    (b1.charAt(i) == '0' && b2.charAt(i) == '1' && temp == 1)){
                res = "0" + res;
                temp = 1;
            } else if (b1.charAt(i) == '1' && b2.charAt(i) == '1' && temp == 1) {
                res = "1" + res;
                temp = 1;
            }

        }
        if (temp == 1) {res = "1" + res;}
        return res;
    }
}
