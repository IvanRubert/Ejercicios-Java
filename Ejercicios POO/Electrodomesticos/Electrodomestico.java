public class Electrodomestico {
    protected final static float PRECIO_BASE_DEF = 100f;
    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_DEF = 'F';

    private float precioBase;
    private String color;
    private char consumo;


    public Electrodomestico(){
        precioBase = PRECIO_BASE_DEF;
        color = COLOR_DEF;
        consumo = CONSUMO_DEF;
    }
    public Electrodomestico(float precio_base, String color){
        this.precioBase = precio_base;
        this.color = comprobarColor(color);
        consumo = CONSUMO_DEF;
    }

    public Electrodomestico(float precio_base, String color, char consumo){
        this.precioBase = precio_base;
        this.color = comprobarColor(color);
        this.consumo = comprobarConsumo(consumo);
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
    public float getPrecioBase() {
        return precioBase;
    }
    public void setColor(String color) {
        this.color = comprobarColor(color);
    }
    public String getColor() {
        return color;
    }
    public void setConsumo(char consumo) {
        this.consumo = comprobarConsumo(consumo);
    }
    public char getConsumo() {
        return consumo;
    }

    private String comprobarColor(String color) {
        if (color == null) {color = COLOR_DEF;}
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("gris")){
            return color;
        }else return COLOR_DEF;
    }

    private char comprobarConsumo(char consumo) {
        consumo = String.valueOf(consumo).toUpperCase().charAt(0);
        return switch (consumo) {
            case 'A', 'B', 'C', 'D', 'E', 'F' -> consumo;
            default -> CONSUMO_DEF;
        };
    }

    public float precioFinal(){
        return switch (consumo){
            case 'A' -> precioBase +60;
            case 'B' -> precioBase +50;
            case 'C' -> precioBase +40;
            case 'D' -> precioBase +30;
            case 'E' -> precioBase +20;
            default -> precioBase +10;
        };
    }
}
