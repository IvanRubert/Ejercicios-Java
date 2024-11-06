public class Longitud2 {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");
        int k = Utilidades.leerEntero("Introduce el numero separador: ");
        boolean res = longitud(cad, k);
        if (res) {
            System.out.println("Hay alguna palabra con longitud " + k);
        } else {
            System.out.println("No hay ninguna palabra con longitud " + k);
        }
    }

    private static boolean longitud(String cad, int k) {
        if (k < 0){return false;}
        String[] cadArray = Utilidades.dividirEnPalabras(cad);
        for (int i = 0; i < cadArray.length; i++) {
            if (cadArray[i].length() == k) {return true;}
        }
        return false;
    }
}
