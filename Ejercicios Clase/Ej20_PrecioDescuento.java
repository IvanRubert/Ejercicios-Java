import javax.swing.*;

public class Ej20_PrecioDescuento {
    public static void main(String[] args) {
        float precioTotal;

        float precioSinDescuento = Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del producto: "));

        if (precioSinDescuento >= 60) {
            precioTotal = precioSinDescuento - (precioSinDescuento * 10 / 100);
        } else if (precioSinDescuento >= 6) {
            precioTotal = precioSinDescuento - (precioSinDescuento * 5 / 100);
        } else {
            precioTotal = precioSinDescuento;
        }

        System.out.println("El precio final con el descuento es de " + precioTotal + "€");
    }
}
