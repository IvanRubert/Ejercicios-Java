import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        Coche2 c1 = new Coche();
        Coche2 c2 = new Coche();
        Coche2 c3 = new Coche();
        Coche2 c4 = new Coche();

        Scanner input = new Scanner(System.in);
        System.out.print("¿Que coche ganará? (1-4): ");
        int opcion = input.nextInt();
        input.nextLine();

        System.out.printf("Coche 1: %dm %nCoche 2: %dm %nCoche 3: %dm %nCoche 4: %dm %n", c1.longitudRecorrida(), c2.longitudRecorrida(), c3.longitudRecorrida(), c4.longitudRecorrida());
        switch (opcion){
            case 1:
                if ((c1.longitudRecorrida() > c2.longitudRecorrida()) && (c1.longitudRecorrida() > c3.longitudRecorrida()) && (c1.longitudRecorrida() > c4.longitudRecorrida())){
                    System.out.println("Has ganado");
                }else {
                    System.out.println("Has perdido");
                }
                break;
            case 2:
                if ((c2.longitudRecorrida() > c1.longitudRecorrida()) && (c2.longitudRecorrida() > c3.longitudRecorrida()) && (c2.longitudRecorrida() > c4.longitudRecorrida())){
                    System.out.println("Has ganado");
                }else {
                    System.out.println("Has perdido");
                }
                break;
            case 3:
                if ((c3.longitudRecorrida() > c2.longitudRecorrida()) && (c3.longitudRecorrida() > c1.longitudRecorrida()) && (c3.longitudRecorrida() > c4.longitudRecorrida())){
                    System.out.println("Has ganado");
                }else {
                    System.out.println("Has perdido");
                }
                break;
            case 4:
                if ((c4.longitudRecorrida() > c2.longitudRecorrida()) && (c4.longitudRecorrida() > c3.longitudRecorrida()) && (c4.longitudRecorrida() > c1.longitudRecorrida())){
                    System.out.println("Has perdido");
                }else {
                    System.out.println("Has ganado");
                }
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }
}
