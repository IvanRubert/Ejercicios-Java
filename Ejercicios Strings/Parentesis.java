import java.util.ArrayList;

public class Parentesis {
    public static void main(String[] args) {
        String cad = Utilidades.leerCadenaNextLine("Introduce una cadena con parentesis:");

        boolean res = comprobarParentesis(cad);
        if (res) {
            System.out.println("Esta bien parentizada");
        }else {
            System.out.println("Esta mal parentizada");
        }
    }

    private static boolean comprobarParentesis(String s) {
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
                list.add(s.charAt(i));
            }
        }
        for (int i = 0; i < list.toArray().length; i++) {
            if (list.get(i) == ')' || list.get(list.toArray().length - 1) == '(') {return false;}
            else {
                if (list.get(i) == '(') {
                    int j = i;
                    while (list.get(i) != '.' ){
                        j++;
                        if (j == list.toArray().length) {return false;}
                        if (list.get(j) == ')') {
                            list.set(i, '.');
                            list.set(j, '.');
                        }
                    }
                }
            }
        }
        return true;
    }
}
