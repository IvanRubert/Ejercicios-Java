class Pajaro2 {
    private static int numPajaros = 0;
    private char color; // propiedad o atributo color
    private int edad; // propiedad o atributo edad
    private boolean enjaulado = false;

    public Pajaro2(){
        color = 'v';
        edad = 0;
        numPajaros++;
    }
    public Pajaro2(char color, int e) {
        this.color = color;
        edad = e;
        numPajaros++;
    }

    public int printNumPajaros() {
        return numPajaros;
    }
    // *** métodos de la clase ***
    public void setEdad(int e) {
        edad = e;
    }
    public int devuelveEdad() {
        return edad;
    }
    public void printEdad() {
        System.out.println(edad);
    }
    public void setColor(char c) {
        color = c;
    }
    public String printColor() {
        switch (color) {
            //los pájaros son verdes, amarillos, grises, negros o blancos
            //No existen pájaros de otros colores
            case 'v':
                return "verde";
            case 'a':
                return "amarillo";
            case 'g':
                return "gris";
            case 'n':
                return "negro";
            case 'b':
                return "blanco";
            default:
                return "color no establecido";
        }
    }
    public void enjaular(){
        enjaulado = true;
    }
    public void desenjaular(){
        enjaulado = false;
    }
    public boolean estaEnjaulado(){
        return enjaulado;
    }

    public int sumaEdades(Pajaro2... p){
        int edades = 0;
        for (Pajaro2 pajaro : p){
            edades += pajaro.edad;
        }
        return edades;
    }
}
