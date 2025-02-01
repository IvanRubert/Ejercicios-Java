import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex8 {
    public static void main(String[] args) {
        String tel = "+34123456789";
        Pattern regex = Pattern.compile("^\\+34[0-9]{9}$");
        Matcher filter = regex.matcher(tel);

        if (filter.find()){
            System.out.println("El teléfono "+filter.group()+" es válido");
        }else {
            System.out.println("Error: El teléfono "+tel+" no es válido");
        }
    }
}
