import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex9 {
    public static void main(String[] args) {
        String ip = "10.0.255.17";
        Pattern regex = Pattern.compile("^((1?\\d?\\d|2[0-4]\\d|25[0-5])\\.){3}(1?\\d?\\d|2[0-4]\\d|25[0-5])$");
        Matcher filter = regex.matcher(ip);

        if (filter.find()){
            System.out.println("La IP "+filter.group()+" es válida");
        }else {
            System.out.println("Error: La IP "+ip+" no es válido");
        }
    }
}
