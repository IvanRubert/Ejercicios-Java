public class Substring {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una palabra: ");
        int ini = Utilidades.leerEntero("Introduce el indice del inicio: ");
        int fin = Utilidades.leerEntero("Introduce el indice del final: ");

        String res = extraer(cad, ini, fin);
        System.out.println("La cadena extraida es: " + res);
    }

    private static String extraer(String s, int numI, int numF) {
        try {
            return s.substring(numI, numF);
        } catch (Exception e) {
            return "";
        }
    }
}
