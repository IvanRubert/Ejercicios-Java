public class Digitos {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");
        int res = cuentaDigitos(cad);
        System.out.println("Hay " + res + " digitos en la cadena");
    }

    private static int cuentaDigitos(String s) {
        String[] cadArray = Utilidades.dividirEnPalabras(s);
        boolean digito;
        int nums = 0;
        for (int i = 0; i < cadArray.length; i++) {
            digito = esDigito(cadArray[i]);
            if (digito) {nums += cadArray[i].length();}
        }
        return nums;
    }

    private static boolean esDigito(String s) {
        return s.matches("[0-9]+");
    }
}
