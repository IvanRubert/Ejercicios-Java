import javax.swing.*;

public class Ej7_CalcularDescuento {
    public static void main(String[] args) {
        float precioReal = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio real: "));
        float precioRebajado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio rebajado: "));

        float descuento = (precioReal - precioRebajado) / precioReal * 100;
        System.out.println("El descuento es de un " + descuento + "%");

    }
}
