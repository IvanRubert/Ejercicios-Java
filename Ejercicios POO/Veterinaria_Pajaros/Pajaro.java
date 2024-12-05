import java.text.DecimalFormat;
import java.util.Scanner;

public class Pajaro {
    private String nombre;
    private String especie;
    private static int numPajaros = 0;
    private String color;
    private int peso;
    private int altura;
    private int edad;
    private boolean fractura = false;
    private boolean intoxicado = false;
    private boolean noCome = false;
    private boolean curado;

    private Scanner input = new Scanner(System.in);

    public Pajaro(String nom, String esp, int edad, int weight_gramos, int height){
        nombre = nom;
        especie = esp;
        this.edad = edad;
        peso = weight_gramos;
        altura = height;
        curado = false;
        numPajaros++;
    }
    public Pajaro(String nom, String esp, int edad, int weight_gramos, int height, String col, boolean curado){
        nombre = nom;
        especie = esp;
        this.edad = edad;
        peso = weight_gramos;
        altura = height;
        color = col;
        this.curado = curado;
        numPajaros++;
    }

    public void setNombre(String n){
        nombre = n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEspecie(String e){
        especie = e;
    }
    public String getEspecie(){
        return especie;
    }
    public void setColor(String c){
        color = c;
    }
    public String getColor(){
        return color;
    }
    public void setEdad(int e){
        edad = e;
    }
    public int getEdad(){
        return edad;
    }
    public void setPeso(int p){
        peso = p;
    }
    public int getPeso(){
        return peso;
    }
    public void setAltura(int a){
        altura = a;
    }
    public int getAltura(){
        return peso;
    }
    public int getNumPajaros(){
        return numPajaros;
    }
    public void setCurado(boolean c) {
        curado = c;
    }
    public boolean isCurado() {
        return curado;
    }

    public float imc(){
        DecimalFormat formato = new DecimalFormat("#.###");
        return Float.parseFloat(formato.format(peso/Math.pow(altura,2)).replace(',', '.'));
    }

    public void setDiagnostico(){
        int opcion;
        do {
            System.out.print("1.Fractura \n2.Intoxicado \n3.No come \n");
            System.out.print("¿Que sintoma tiene tu pajaro? (-1 para terminar): ");
            opcion = input.nextInt();
            input.nextLine();

            switch (opcion){
                case 1:
                    fractura = true;
                    break;
                case 2:
                    intoxicado = true;
                    break;
                case 3:
                    noCome = true;
                    break;
                case -1:
                    System.out.println("Diagnostico finalizado.");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != -1);
    }

    public void setTratamiento(){
        if (fractura){
            System.out.println("Tratamiento de fractura: Inmovilización (férula) y Analgesico ("+dosisAnalgesico()+"mg 2 veces/dia)\n");
        }
        if (intoxicado){
            System.out.println("Tratamiento de intoxicación: Limpieza de estomago y Hidratarlo frecuentemente\n");
        }
        if (noCome){
            System.out.println("Tratamiento contra la falta de alimentación: Administrar papilla nutricional y liquido mediante una jeringa directamente a su pico\n");
        }
        curado = true;
    }
    private float dosisAnalgesico(){
        DecimalFormat formato = new DecimalFormat("#.##");

        return Float.parseFloat(formato.format(0.2*peso));
    }
}
