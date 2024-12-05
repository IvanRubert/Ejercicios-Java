public class Carta {
    private int numero;
    private String tipo;

    public Carta(int numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }
    public String getTipo() {
        return tipo;
    }
    public String getCarta(){
        return numero+" de "+tipo;
    }
}
