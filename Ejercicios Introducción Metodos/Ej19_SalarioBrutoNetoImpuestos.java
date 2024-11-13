import javax.swing.*;

public class Ej19_SalarioBrutoNetoImpuestos {
    public static void main(String[] args) {
        float primeras35Horas;
        int horasExtras;
        float pagoExtra;
        float pagoBruto;
        float pagoNeto;
        float impuestos;

        float precioPorHora = Float.parseFloat(JOptionPane.showInputDialog("Cuanto es el precio por hora? "));
        int numHoras = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas ha trabajado? "));

        if (numHoras > 35) {
            primeras35Horas = 35 * precioPorHora;
            horasExtras = numHoras - 35;
            pagoExtra = (float) (horasExtras * (precioPorHora * 1.5));
            pagoBruto = primeras35Horas + pagoExtra;
            impuestos = calcularImpuestos(pagoBruto);
            pagoNeto = pagoBruto - impuestos;
        } else {
            pagoBruto = numHoras * precioPorHora;
            impuestos = calcularImpuestos(pagoBruto);
            pagoNeto = pagoBruto - impuestos;
        }

        System.out.println("Pago bruto: " + pagoBruto + "€");
        System.out.println("Pago neto: " + pagoNeto + "€");
        System.out.println("Impuestos: " + impuestos + "€");
    }

    public static float calcularImpuestos(float pagoBruto) {
        float brutoMenos500;
        float impuestosPrimeros400;
        float otrosImpuestos;
        float impuestosTotales;

        if (pagoBruto > 500) {
            brutoMenos500 = pagoBruto - 500;
            if (brutoMenos500 > 400) {
                impuestosPrimeros400 = 400 * 25 / 100;
                otrosImpuestos = (brutoMenos500 - 400) * 45 / 100;
                impuestosTotales = impuestosPrimeros400 + otrosImpuestos;
                return impuestosTotales;
            } else {
                impuestosTotales = brutoMenos500 * 25 / 100;
                return impuestosTotales;
            }
        } else {
            return 0;
        }
    }
}
