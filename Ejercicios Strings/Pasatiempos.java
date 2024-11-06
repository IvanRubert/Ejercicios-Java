public class Pasatiempos {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena para que sustituya las vocales por puntos: ");
        cad = cad.replaceAll("[aeiouAEIOU]", ".");
        System.out.println(cad);
    }
}
