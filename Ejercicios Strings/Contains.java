public class Contains {
    public static void main(String[] args) {
        String cad1 = Utilidades.leerCadenaNextLine("Introduce la primera cadena: ");
        String cad2 = Utilidades.leerCadenaNextLine("Introduce la segunda cadena: ");

        boolean resultado = contiene(cad1, cad2);
        if (resultado) {
            System.out.println("La primera cadena contiene a la segunda");
        } else {
            System.out.println("La primera cadena no contiene a la segunda");
        }
    }

    private static boolean contiene(String c1, String c2) {
        return c1.contains(c2);
    }
}
