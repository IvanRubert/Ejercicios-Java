public class CompararIgnoreCase {
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadenaNextLine("Introduce la primera cadena: ");
        String cadena2 = Utilidades.leerCadenaNextLine("Introduce la segunda cadena: ");
        int resultado = compararIgnoreCase(cadena1, cadena2);

        if (resultado == 0){
            System.out.println("Las dos cadenas son iguales");
        } else if (resultado > 0) {
            System.out.println("La segunda cadena es mayor que la primera cadena");
        } else {
            System.out.println("La primera cadena es mayor que la segunda cadena");
        }
    }

    private static int compararIgnoreCase(String c1, String c2) {
        return c1.compareToIgnoreCase(c2);
    }
}
