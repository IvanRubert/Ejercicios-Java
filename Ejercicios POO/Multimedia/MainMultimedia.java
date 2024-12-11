import javax.swing.*;

public class MainMultimedia {
    public static void main(String[] args) {
        int opcion;
        int repeticiones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos archivos multimedia vas a crear?"));
        String[] opciones = {"Pelicula", "Disco"};
        Multimedia[] listaMultimedia = new Multimedia[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            opcion = JOptionPane.showOptionDialog(null, "¿Que quieres crear?", "Creacion multimedia", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, 0);
            String titulo = JOptionPane.showInputDialog("¿Cual es el titulo?");
            String autor = JOptionPane.showInputDialog("¿Cual es el autor?");
            int formatoPos = JOptionPane.showOptionDialog(null, "¿Que formato tiene?", "Formato", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, Multimedia.FORMATOS, 0);
            float duracion = Float.parseFloat(JOptionPane.showInputDialog("¿Cuanto  dura?"));

            if (opcion == 0){
                String actor, actriz;
                opcion = JOptionPane.showOptionDialog(null, "¿Tiene actor principal?", "Actor", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 1);
                if (opcion == 0){
                    actor = JOptionPane.showInputDialog("¿Como se llama el actor principal?");
                }else actor = null;
                opcion = JOptionPane.showOptionDialog(null, "¿Tiene actriz principal?", "Actriz", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, 0);
                if (opcion == 0){
                    actriz = JOptionPane.showInputDialog("¿Como se llama el actriz principal?");
                } else actriz = null;

                listaMultimedia[i] = new Pelicula(titulo, autor, Multimedia.FORMATOS[formatoPos], duracion,actor, actriz);
            }else if (opcion == 1){
                String discografica = JOptionPane.showInputDialog("¿Cual es la discografica?");
                int numCanciones = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas canciones hay?"));
                listaMultimedia[i] = new Disco(titulo, autor, Multimedia.FORMATOS[formatoPos], duracion,discografica, numCanciones);
            }
        }

        String[] lista = new String[listaMultimedia.length+1];
        do {
            for (int i = 0; i < listaMultimedia.length; i++) {
                lista[i] = listaMultimedia[i].getTitulo();
            }
            lista[lista.length-1] = "Salir";
            opcion = JOptionPane.showOptionDialog(null, "¿Que archivo multimedia quieres mostrar su información?", "Mostrar información", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, lista, 0);

            if (opcion == lista.length-1) {
                System.out.println("\nHas terminado");
            } else if (listaMultimedia[opcion] instanceof Pelicula) {
                System.out.println("***************************");
                System.out.println("Información de la película");
                System.out.println("***************************");
                System.out.println(listaMultimedia[opcion].toString());
            } else if (listaMultimedia[opcion] instanceof Disco) {
                System.out.println("**********************");
                System.out.println("Información del disco");
                System.out.println("**********************");
                System.out.println(listaMultimedia[opcion].toString());
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }while (opcion != lista.length-1);
    }
}
