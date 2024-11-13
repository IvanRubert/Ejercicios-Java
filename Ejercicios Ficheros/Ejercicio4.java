import java.io.*;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Introduce la ruta del archivo CSV: ");
            FileReader rutaCsv = new FileReader(input.nextLine());
            BufferedReader lectorCsv = new BufferedReader(rutaCsv);
            System.out.print("Introduce la ruta donde se creará el archivo HTML: ");
            FileWriter rutaHtml = new FileWriter(input.nextLine(), false);
            PrintWriter escribirHtml = new PrintWriter(rutaHtml);

            String[] cabecera = lectorCsv.readLine().split(",");
            escribirHtml.println("<html>");
            escribirHtml.println("<head>");
            escribirHtml.println("<title>Tabla con CSV</title>");
            escribirHtml.println("<meta charset=\"UTF-8\">");
            escribirHtml.println("</head>");
            escribirHtml.println("<body>");
            escribirHtml.println("<table border=\"1\">");
            escribirHtml.println("<tr>");
            for (int i = 0; i<cabecera.length; i++){
                escribirHtml.println("<th>"+cabecera[i]+"</th>");
            }
            escribirHtml.println("</tr>");
            String linia;
            while ((linia = lectorCsv.readLine()) != null){
                escribirHtml.println("<tr>");
                String[] contenido = linia.split(",");
                for (int i = 0; i < cabecera.length; i++) {
                    escribirHtml.println("<td>"+contenido[i]+"</td>");
                }
                escribirHtml.println("</tr>");
            }
            escribirHtml.println("</table>");
            escribirHtml.println("</body>");
            escribirHtml.println("</html>");

            escribirHtml.close();
            lectorCsv.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}