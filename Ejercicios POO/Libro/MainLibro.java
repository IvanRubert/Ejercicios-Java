import java.util.Random;

public class MainLibro {
    public static void main(String[] args) {
        long ISBN = isbnRandom();
        Libro libro1 = new Libro();
        libro1.setTitulo("El Lazarillo de Tormes");
        libro1.setISBN(ISBN);
        libro1.setAutor("Anonimo");
        libro1.setNumPaginas(144);

        ISBN = isbnRandom();
        Libro libro2 = new Libro("La Catedral", ISBN, "Vicente Blasco Ibáñez", 223);

        System.out.println("Libro 1: "+libro1.datos());
        System.out.println("Libro 2: "+libro2.datos());
        System.out.println();

        compararPaginas(libro1, libro2);
    }

    private static void compararPaginas(Libro l1, Libro l2) {
        if (l1.getNumPaginas() > l2.getNumPaginas()){
            System.out.println("El libro \""+l1.getTitulo()+"\" tiene mas páginas");
        }else {
            System.out.println("El libro \""+l2.getTitulo()+"\" tiene mas páginas");
        }
    }

    private static long isbnRandom() {
        Random rand = new Random();
        long min = 1000000000000L;
        long max = 9999999999999L;
        return min + (long) (rand.nextDouble()*(max-min+1));
    }
}
