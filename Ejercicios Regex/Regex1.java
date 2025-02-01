import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "ivarubalb@alu.edu.gva.es";
        Pattern regex = Pattern.compile("^([a-z]{3}){2,3}\\d{0,3}@alu\\.edu\\.gva\\.es$");
        Matcher filtro = regex.matcher(s);
        if (filtro.find()){
            System.out.println(filtro.group()+" es un correo válido");
        }else System.out.println("Error. El correo "+s+" no es válido");
    }
}
