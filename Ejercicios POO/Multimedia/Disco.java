public class Disco extends Multimedia{
    String discografica;
    int numCanciones;

    public Disco(String titulo, String autor, String formato, float duracion, String discografica, int numCanciones) {
        super(titulo, autor, formato, duracion);
        this.discografica = discografica;
        this.numCanciones = numCanciones;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }
    public String getDiscografica() {
        return discografica;
    }
    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }
    public int getNumCanciones() {
        return numCanciones;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDiscografica: "+discografica+"\nNúmero de canciones: "+numCanciones;
    }
}
