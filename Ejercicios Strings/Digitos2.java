public class Digitos2 {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");
        int res = cuentaNumeros(cad);
        System.out.println("Hay " + res + " numeros en la cadena");
    }

    private static int cuentaNumeros(String s) {
        String[] cadArray = Utilidades.dividirEnPalabras(s);
        boolean digito;
        int nums = 0;
        for (int i = 0; i < cadArray.length; i++) {
            digito = esDigito(cadArray[i]);
            if (digito) {nums++;}
        }
        return nums;
    }

    private static boolean esDigito(String s) {
        return s.matches("[0-9]+([.,][0-9]+)?");
    }
}
