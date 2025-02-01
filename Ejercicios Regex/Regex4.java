import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        String num = "1.2134";
        Pattern regex = Pattern.compile("^-?\\d+[\\.,]\\d{4}");
        Matcher filter = regex.matcher(num);

        if (filter.find()){
            System.out.println(filter.group()+" es un número válido");
        }else {
            System.out.println("Error: "+num+" no es un número válido");
        }
    }
}
