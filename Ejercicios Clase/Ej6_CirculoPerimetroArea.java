import javax.swing.*;

public class Ej6_CirculoPerimetroArea {
    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
        double PI = Math.PI;

        double length = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Length: " + length);
        System.out.println("Area: " + area);
    }
}
