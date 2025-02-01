import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s = "b.paternalluch@edu.gva.es";
        Pattern regex = Pattern.compile("^[a-z]{1,2}\\.[a-z]+\\d{0,3}@edu\\.gva\\.es$");
        Matcher filtro = regex.matcher(s);
        if (filtro.find()){
            System.out.println(filtro.group()+" es un correo válido");
        }else System.out.println("Error. El correo "+s+" no es válido");
    }
}
