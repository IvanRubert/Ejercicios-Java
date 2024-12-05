public class Coche2 {
    private int aceleracion = 0;
    private int duracion = 0;

    public Coche2(){
        aceleracion = (int) (Math.random() * 100);
        duracion = (int) (Math.random() * 60);
    }
    public int longitudRecorrida(){
        return aceleracion * duracion;
    }
}
