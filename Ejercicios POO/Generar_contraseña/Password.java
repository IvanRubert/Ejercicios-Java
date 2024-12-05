import java.util.Random;

public class Password {
    private int longitud;
    private String password;

    public Password(){
        longitud = 8;
        generarPassword();
    }
    public Password(int longitud){
        this.longitud = longitud;
        generarPassword();
    }

    public String getPassword() {
        return password;
    }
    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean esFuerte(){
        int nums = 0, mayusculas = 0, minusculas = 0;
        for (int i = 0; i < password.length(); i++) {
            if (String.valueOf(password.charAt(i)).matches("[0-9]")){
                nums++;
            } else if (String.valueOf(password.charAt(i)).matches("[A-Z]")) {
                mayusculas++;
            }else {
                minusculas++;
            }
        }
        if (mayusculas >= 3 && minusculas >= 2 && nums >= 3){
            return true;
        }else return false;
    }
    public void generarPassword() {
        String cadena = "";
        Random random = new Random();
        int unicodeValue;
        char unicodeChar;
        for (int i = 0; i < longitud; i++) {
            int posicion = random.nextInt(3);
            if (posicion == 0){//numeros
                unicodeValue = random.nextInt(0x0039 - 0x0030 + 1) + 0x0030;
                unicodeChar = (char) unicodeValue;
            } else if (posicion == 1) {//Mayusculas
                unicodeValue = random.nextInt(0x005A - 0x0041 + 1) + 0x0041;
                unicodeChar = (char) unicodeValue;
            }else {//Minusculas
                unicodeValue = random.nextInt(0x007A - 0x0061 + 1) + 0x0061;
                unicodeChar = (char) unicodeValue;
            }
            cadena += unicodeChar;
        }
        password = cadena;
    }
    public String datos(){
        return "Contraseña de "+longitud+" caracteres: "+password;
    }
}
