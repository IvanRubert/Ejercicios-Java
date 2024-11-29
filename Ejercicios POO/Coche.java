public class Coche {
    private int aceleracion = 0;
    private int duracion = 0;

    public Coche(){
        aceleracion = (int) (Math.random() * 100);
        duracion = (int) (Math.random() * 60);
    }
    public int longitudRecorrida(){
        return aceleracion * duracion;
    }
}
