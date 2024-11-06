public class Concat {
    public static void main(String[] args) {
        String cad1 = Utilidades.leerCadenaNextLine("Introduce la primera cadena: ");
        String cad2 = Utilidades.leerCadenaNextLine("Introduce la segunda cadena: ");

        String resultado = concatenar(cad1, cad2);
        System.out.println("La cadena concatenada es: " + resultado);
    }

    private static String concatenar(String c1, String c2) {
        return c1.concat(c2);
    }
}
