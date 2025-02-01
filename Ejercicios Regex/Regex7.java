import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex7 {
    public static void main(String[] args) {
        String tarjeta = "1111-1111-1111-1111";
        Pattern regex = Pattern.compile("(\\d{4}-){3}\\d{4}");
        Matcher filter = regex.matcher(tarjeta);

        if (filter.matches()){
            System.out.println("La tarjeta "+filter.group()+" es válida");
        }else {
            System.out.println("Error: La tarjeta "+tarjeta+" no es válida");
        }
    }
}
