import javax.swing.*;

public class ArrayBid6 {
    public static void main(String[] args) {
        int[][] productosVendidos = {{50,60,70,40,20,80},
                {30,40,50,60,70,40},
                {20,30,60,70,40,40}};
        String[] opciones = {"Venta total de cada producto durante la semana", "Venta total por dia", "Venta total de toda la semana", "Salir"};
        int opcion;
        do {
            opcion = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Opciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
            int suma = 0;
            if (opcion == 0){
                for (int i = 0; i < productosVendidos.length; i++){
                    for (int j = 0; j < productosVendidos[i].length; j++){
                        suma+=productosVendidos[i][j];
                    }
                    System.out.println("la venta total del Producto "+(i+1)+" es: "+suma+" €");
                    suma = 0;
                }
            } else if (opcion == 1) {
                for (int i = 0; i < productosVendidos[0].length; i++) {

                    for (int j = 0; j < productosVendidos.length; j++) {
                        suma+=productosVendidos[j][i];
                    }
                    System.out.println("La venta total del dia "+(i+1)+" es "+suma+" €");
                    suma = 0;
                }
            } else if (opcion == 2) {
                for (int[] fila : productosVendidos){
                    for (int precio : fila){
                        suma+=precio;
                    }
                }
                System.out.println("La venta total de la semana es: "+suma+" €");

            }else {System.out.println("Has salido");}
            System.out.println();
        }while (opcion != 3);
    }
}
