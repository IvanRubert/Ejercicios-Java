public class Persona {
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
            return -1;
        } else if (imc>25){
            return 1;
        }else return 0;
    }
    public String datos(){
        return "********\nNombre: "+nombre+"\nEdad: "+edad+" años\nSexo: "+sexo+"\nPeso: "+peso+" Kg\nAltura: "+altura+" m";
    }
}
