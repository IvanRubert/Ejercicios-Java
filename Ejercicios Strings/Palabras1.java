public class Palabras1 {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena de texto: ");
        cad=cad.replaceAll(",+|;+|\\.+|:+", " ");
        cad=cad.replaceAll(" +", " ");
        cad=cad.trim();
        String[] cadArray = cad.split(" ");
        System.out.println("Numero de palabras: " + cadArray.length);
    }
}
