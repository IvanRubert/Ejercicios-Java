public class Criptografia {
    public static void main(String[] args) {
        String text, res = "";
        int n;
        int opcion = Utilidades.leerEntero("Introduce una opcion: \n1->Encriptar \n2->Desencriptar ");
        switch (opcion){
            case 1:
                text = Utilidades.leerCadenaNext("Introduce el texto a encriptar: ");
                n = Utilidades.leerEntero("Introduce el numero de desplazamiento de las letras: ");
                res = encriptarTexto(text, n);
                break;
            case 2:
                text = Utilidades.leerCadenaNext("Introduce el texto a desencriptar: ");
                n = Utilidades.leerEntero("Introduce el numero de desplazamiento de las letras: ");
                res = encriptarTexto(text, -n);
                break;
            default:
                System.out.println("Opcion incorrecta: vuelve a introducirlo");
                main(null);
                break;
        }
        System.out.println(res);
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
