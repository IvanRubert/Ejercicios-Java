public class Invertida {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena para invertir las palabras:");
        String res = cadenaInvertida(Utilidades.dividirEnPalabras(cad));
        System.out.println(res);
    }

    private static String cadenaInvertida(String[] array) {
        String s = "";
        for (int i = array.length - 1; i >= 0; i--) {
            s = s + array[i] + " ";
        }
        return s;
    }
}
