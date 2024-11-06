public class Ends {
    public static void main(String[] args) {
        String cad1 = Utilidades.leerCadenaNextLine("Introduce la primera cadena: ");
        String cad2 = Utilidades.leerCadenaNextLine("Introduce la segunda cadena: ");

        boolean resultado = contiene(cad1, cad2);
        if (resultado) {
            System.out.println("La primera cadena ternima con " + cad2);
        } else {
            System.out.println("La primera cadena no termina con " + cad2);
        }
    }

    private static boolean contiene(String c1, String c2) {
        return c1.endsWith(c2);
    }
}
