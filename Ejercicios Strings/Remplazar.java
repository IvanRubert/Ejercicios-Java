public class Remplazar {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");
        char c1 = Utilidades.leerCaracter("Introduce el caracter a remplazar: ");
        char c2 = Utilidades.leerCaracter("Introduce el caracter que remplazara: ");

        String resultado = remplaza(cad, c1, c2);
        System.out.println(resultado);
    }

    private static String remplaza(String s, char ch1, char ch2) {
        return s.replace(ch1, ch2);
    }
}
