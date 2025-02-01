import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String hex = "A62F";
        Pattern regex = Pattern.compile("^[0-9A-F]+$");
        Matcher filter = regex.matcher(hex);

        if (filter.find()){
            System.out.println(filter.group()+" es un número hexadecimal válido");
        }else {
            System.out.println("Error: "+hex+" no es un valor hexadecimal");
        }
    }
}
