import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex6 {
    public static void main(String[] args) {
        String fecha = "23/01/2025";
        Pattern regex = Pattern.compile("^(0\\d|[12]\\d|3[01])/(0[1-9]|1[0-2])/[0-9]{4}$");
        Matcher filter = regex.matcher(fecha);

        if (filter.find()){
            System.out.println("La fecha "+filter.group()+" es correcta");
        }else {
            System.out.println("La fecha "+fecha+" es incorrecta");
        }
    }
}
