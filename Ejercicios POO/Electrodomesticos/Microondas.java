public class Microondas extends Electrodomestico {
    private final static int NUM_PROG_DEF = 4;

    private int numProgramas;

    public Microondas(){
        super();
        numProgramas = NUM_PROG_DEF;
    }
    public Microondas(float precioBase, String color){
        super(precioBase, color);
        numProgramas = NUM_PROG_DEF;
    }
    public Microondas(float precioBase, String color, char consumo, int numProgramas){
        super(precioBase, color, consumo);
        this.numProgramas = numProgramas;
    }

    public void setNumProgramas(int numProgramas) {
        this.numProgramas = numProgramas;
    }
    public int getNumProgramas() {
        return numProgramas;
    }

    @Override
    public float precioFinal() {
        if (numProgramas > 5){
            return super.precioFinal()+40;
        }else return super.precioFinal();
    }

    @Override
    public String toString() {
        String s1 = "**************************\n";
        s1 += "Información de microondas\n";
        s1 += "**************************\n";
        return s1+"Precio Base: "+super.getPrecioBase()+"€\nColor: "+super.getColor()+"\nConsumo: "+super.getConsumo()+"\nNumero de programas: "+numProgramas+"\nPrecio final: "+precioFinal()+"€\n";
    }
}
