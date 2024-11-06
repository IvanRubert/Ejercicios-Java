public class Palabras2 {
    public static void main(String[] args) {
        int contadorPalabras = 0;
        boolean hayPalabra = false;

        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena de texto: ");

        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ' || cad.charAt(i) == ',' || cad.charAt(i) == ';' || cad.charAt(i) == '.' || cad.charAt(i) == ':'){
                if (hayPalabra){
                    hayPalabra = false;
                    contadorPalabras++;
                }
            }else {
                if (i == cad.length()-1){contadorPalabras++;}
                hayPalabra = true;
            }
        }
        System.out.println("Numero de palabras: " + contadorPalabras);
    }
}
