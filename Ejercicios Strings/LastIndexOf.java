public class LastIndexOf {
    public static void main(String[] args) {
        String cad1 = Utilidades.leerCadenaNextLine("Introduce la primera cadena: ");
        String cad2 = Utilidades.leerCadenaNextLine("Introduce la segunda cadena: ");

        int res = indice(cad1, cad2);
        System.out.println("La posicion es " + res);
    }

    private static int indice(String c1, String c2) {
        return c1.lastIndexOf(c2);
    }
}
