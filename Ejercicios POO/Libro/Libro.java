public class Libro {
    private String titulo;
    private long ISBN;
    private String autor;
    private int numPaginas;

    public Libro(){}
    public Libro(String titulo, long isbn, String autor, int numPaginas){
        this.titulo = titulo;
        ISBN = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public long getISBN() {
        return ISBN;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    public int getNumPaginas() {
        return numPaginas;
    }

    public String datos(){
        return "El libro \""+titulo+"\" con ISBN \""+ISBN+"\" con el autor \""+autor+"\" tiene "+numPaginas+" páginas";
    }
}
