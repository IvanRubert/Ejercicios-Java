import javax.swing.*;

public class Ej17_DiasEnElMes {
    public static void main(String[] args) {
        String mes = JOptionPane.showInputDialog("Introduce un mes: ");

        mes = mes.toLowerCase();
        switch (mes) {
            case "febrero":
                boolean bisiesto = calcularBisiesto();
                if (bisiesto) {
                    System.out.println("29 dias");
                } else {
                    System.out.println("28 dias");
                }
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                System.out.println("31 dias");
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                System.out.println("30 dias");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mes no valido", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    private static boolean calcularBisiesto(){
        int year = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año: "));

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
