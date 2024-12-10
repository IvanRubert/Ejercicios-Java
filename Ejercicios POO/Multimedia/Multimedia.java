import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class Multimedia {
    private String titulo, autor, formato;
    private float duracion;
    public final static String[] FORMATOS = {"mp3", "midi", "mp4", "avi"};

    public Multimedia(String titulo, String autor, String formato, float duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public float getDuracion() {
        return duracion;
    }
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nFormato: "+formato+"\nDuración: "+duracion;
    }
}
