public class Longitud {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");
        int k = Utilidades.leerEntero("Introduce el numero separador: ");
        int res = longitud(cad, k);
        System.out.println("Hay " + res + " palabras con longitud " + k);
    }

    private static int longitud(String cad, int k) {
        if (k < 0) {return 0;}
        String[] cadArray = Utilidades.dividirEnPalabras(cad);
        int palabras = 0;
        for (int i = 0; i < cadArray.length; i++) {
            if (cadArray[i].length() == k) {palabras++;}
        }
        return palabras;
    }

}
