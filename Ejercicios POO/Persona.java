public class Persona {
    public static final int PESO_BAJO = -1;
    public static final int PESO_IDEAL = 0;
    public static final int PESO_ALTO = 1;

    private String nombre;
    private int edad;
    private float peso, altura;
    private char sexo;

    public Persona(){
        nombre = "Test";
        edad = 0;
        peso = 0;
        altura = 0;
        sexo = 'M';
    }
    public Persona(String nom, int edad, char sexo){
        nombre = nom;
        this.edad = edad;
        this.sexo = sexo;
        peso = 0;
        altura = 0;
    }
    public Persona(String nom, int edad, char sexo, float weight, float height){
        nombre = nom;
        this.edad = edad;
        this.sexo = sexo;
        peso = weight;
        altura = height;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }
    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setSexo(char sexo) {
        this.sexo = String.valueOf(sexo).toUpperCase().charAt(0);
    }
    public char getSexo() {
        return sexo;
    }
    public void setPeso(float weight) {
        peso = weight;
    }
    public float getPeso() {
        return peso;
    }
    public void setAltura(float height) {
        altura = height;
    }
    public float getAltura() {
        return altura;
    }

    public int calcularIMC(){
        double imc = peso/Math.pow(altura,2);
        if (imc<20){
            return PESO_BAJO;
        } else if (imc>25){
            return PESO_ALTO;
        }else return PESO_IDEAL;
    }
    public String datos(){
        return "********\nNombre: "+nombre+"\nEdad: "+edad+" años\nSexo: "+sexo+"\nPeso: "+peso+" Kg\nAltura: "+altura+" m";
    }
}
