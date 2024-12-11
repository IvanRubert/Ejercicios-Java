public class Lavavajillas extends Electrodomestico {
    private final static int NUM_SERVICIO_DEF = 12;

    private int numServicios;

    public Lavavajillas(){
        super();
        numServicios = NUM_SERVICIO_DEF;
    }
    public Lavavajillas(float precioBase, String color){
        super(precioBase, color);
        numServicios = NUM_SERVICIO_DEF;
    }
    public Lavavajillas(float precioBase, String color, char consumo, int numServicios){
        super(precioBase, color, consumo);
        this.numServicios = numServicios;
    }

    public void setNumServicios(int numServicios) {
        this.numServicios = numServicios;
    }
    public int getNumServicios() {
        return numServicios;
    }

    @Override
    public float precioFinal() {
        if (numServicios > 30){
            return super.precioFinal()+30;
        } else if (numServicios < 12) {
            return super.precioFinal()-10;
        } else return super.precioFinal();
    }

    @Override
    public String toString() {
        String s1 = "**************************\n";
        s1 += "Información de Lavavajillas\n";
        s1 += "**************************\n";
        return s1+"Precio Base: "+super.getPrecioBase()+"€\nColor: "+super.getColor()+"\nConsumo: "+super.getConsumo()+"\nNumero de programas: "+ numServicios +"\nPrecio final: "+precioFinal()+"€\n";
    }
}
