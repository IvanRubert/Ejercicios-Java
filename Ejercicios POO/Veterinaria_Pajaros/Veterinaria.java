import java.util.Scanner;

public class Veterinaria {
    static int edad, peso, altura;
    static String nombre, especie, color;
    static boolean curado;

    public static void main(String[] args) {
        int opcion;
        char op;
        Scanner input = new Scanner(System.in);
        Pajaro p = null;
        do {
            opcion = 0;
            try {
                System.out.print("1. Datos importantes\n2. Todos los datos\n¿Que quieres introducir? ");
                opcion = input.nextInt(); input.nextLine();
                if (opcion == 1){
                    datosRequeridos(input);
                    p = new Pajaro(nombre,especie, edad, peso, altura);
                }else if (opcion == 2){
                    datosRequeridos(input);
                    System.out.print("Introduce el color del pajaro: ");
                    color = input.nextLine();
                    System.out.print("¿El pajaro está curado? (s/n) ");
                    op = input.nextLine().toLowerCase().charAt(0);
                    if (op == 's'){
                        curado = true;
                    }else if (op == 'n'){
                        curado = false;
                    }else throw new Exception("Opción incorrecta");
                } else throw new Exception("Opción incorrecta");
            } catch (Exception e) {
                System.out.println("Error: " +e.getMessage());
                opcion = -1;
                if (e.getMessage() == null){
                    input.nextLine();
                }
            }
        }while (opcion == -1);

        do {
            opcion = 0;
            try{
                System.out.print("1. Calcular IMC\n2. Tratar enfermedad\n0. Terminar\n¿Que quieres hacer? ");
                opcion = input.nextInt(); input.nextLine();

                if (opcion == 1){
                    System.out.println("IMC: "+p.imc());
                    continuar(input);
                } else if (opcion == 2) {
                    p.setDiagnostico();
                    p.setTratamiento();
                    continuar(input);
                } else if (opcion == 0) {
                    System.out.println("Has salido");
                } else throw new Exception("Opción incorrecta");
            }catch (Exception e){
                System.out.println("Error: " +e.getMessage());
                opcion = -1;
                if (e.getMessage() == null){
                    input.nextLine();
                }
            }
        } while (opcion != 0);
    }

    private static void continuar(Scanner input) {
        System.out.println("Pulsa enter para continuar: ");
        input.nextLine();
    }

    private static void datosRequeridos(Scanner input) {
        System.out.print("Introduce el nombre del pajaro: ");
        nombre = input.nextLine();
        System.out.print("Introduce el nombre de la especie del pajaro: ");
        especie = input.nextLine();
        System.out.print("Introduce la edad del pajaro: ");
        edad = input.nextInt(); input.nextLine();
        System.out.print("Introduce el peso en gramos del pajaro: ");
        peso = input.nextInt(); input.nextLine();
        System.out.print("Introduce la altura en centimetros del pajaro: ");
        altura = input.nextInt(); input.nextLine();
    }

}
