public class Siglas {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena para invertir las palabras:");
        String res = siglas(Utilidades.dividirEnPalabras(cad));
        System.out.println("Las siglas son: " + res);
    }

    private static String siglas(String[] array) {
        String s = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("^[A-Z].*")){
                s = s + array[i].charAt(0);

            }
        }
        return s;
    }
}
