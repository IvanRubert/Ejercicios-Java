import javax.swing.*;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        coche1.setMatricula("0000BBB");
        coche1.setMarca("Renault");
        coche1.setModelo("Clio");
        coche1.setMatriculacion(2000);
        coche1.setElectrico(false);

        Coche coche2 = new Coche("1536JBR");
        coche2.setMarca("Kia");
        coche2.setModelo("Sportage");
        coche2.setMatriculacion(2015);
        coche2.setElectrico(false);

        String matricula = JOptionPane.showInputDialog("Introduce la matricula del coche:");
        String marca = JOptionPane.showInputDialog("Introduce la marca del coche:");
        String modelo = JOptionPane.showInputDialog("Introduce la modelo del coche:");
        int matriculacion = Integer.parseInt(JOptionPane.showInputDialog("Introduce el año de m̀atriculación del coche:"));
        int opcion = JOptionPane.showOptionDialog(null, "¿El coche es eléctrico?", "Es eléctrico", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null,0);
        boolean electrico;
        if (opcion == 0) {electrico = true;} else {electrico =false;}
        Coche coche3 = new Coche(matricula, marca, modelo, matriculacion, electrico);
        Coche coche4 = new Coche(coche3);

        System.out.println("Coche 1: "+ coche1.datos());
        System.out.println("Coche 2: "+ coche2.datos());
        System.out.println("Coche 3: "+ coche3.datos());
        System.out.println("Coche 4: "+ coche4.datos());
    }
}
