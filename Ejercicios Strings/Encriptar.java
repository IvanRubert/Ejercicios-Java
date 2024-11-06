public class Encriptar {
    public static void main(String[] args) {
        String text = Utilidades.leerCadenaNextLine("Introduce el texto a encriptar: ");
        int n = Utilidades.leerEntero("Introduce el numero de desplazamiento de las letras: ");

        String encr = encriptarTexto(text, n);
        System.out.println(encr);
    }

    private static String encriptarTexto(String s, int n) {
        char nuevoChar;
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
