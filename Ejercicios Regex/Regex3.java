import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {
        String s = "@-_-";
        Pattern regex = Pattern.compile("^@[a-zA-Z0-9-_]+$");
        Matcher filtro = regex.matcher(s);

        if (filtro.find()){
            System.out.println(filtro.group()+" es un nombre válido");
        }else {
            System.out.println("Error: "+s+" no es un nombre válido");
        }
    }
}
