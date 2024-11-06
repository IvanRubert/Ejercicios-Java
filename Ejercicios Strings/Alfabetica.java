public class Alfabetica {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena: ");

        boolean res = esAlfabetico(cad.replaceAll(" +", ""));
        if (res){
            System.out.println("La palabra " + cad + " es una palabra alfabetica");
        } else {
            System.out.println("La palabra " + cad + " no es una palabra alfabetica");
        }
    }

    private static boolean esAlfabetico(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.toLowerCase().codePointAt(i) > s.toLowerCase().codePointAt(i+1)) {return false;}
        }
        return true;
    }
}
