public class Desencriptar {
    public static void main(String[] args) {
        String encr = Utilidades.leerCadenaNextLine("Introduce el texto a desencriptar: ");
        int n = Utilidades.leerEntero("Introduce el numero de desplazamiento de las letras: ");

        String text = desencriptarTexto(encr, n);
        System.out.println(text);
    }

    private static String desencriptarTexto(String s, int n) {
        char nuevoChar;
        n = -n;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                nuevoChar = (char) ((s.charAt(i) - 'a' + n) % 26 + 'a');
                res = res + nuevoChar;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                nuevoChar = (char) ((s.charAt(i) - 'A' + n) % 26 + 'A');
                res = res + nuevoChar;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                nuevoChar = (char) ((s.charAt(i) - '0' + n) % 10 + '0');
                res = res + nuevoChar;
            } else {
                res = res + s.charAt(i);
            }
        }
        return res;
    }

}
