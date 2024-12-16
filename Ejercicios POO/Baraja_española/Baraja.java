import java.util.ArrayList;
import java.util.Random;

public class Baraja {
    private ArrayList<Carta> baraja = new ArrayList<Carta>();
    private ArrayList<Carta> monton = new ArrayList<Carta>();

    public Baraja(){
        baraja = crearBaraja();
    }

    private ArrayList<Carta> crearBaraja() {
        ArrayList<Carta> lista = new ArrayList<Carta>();
        String[] tipos = {"OROS", "COPAS", "ESPADAS", "BASTOS"};
        for (int i = 0; i < tipos.length; i++) {
            for (int num = 1; num <= 12; num++) {
                if (num != 8 && num!=9){
                    Carta c = new Carta(num, tipos[i]);
                    lista.add(c);
                }
            }
        }
        return lista;
    }
    public void barajar(){
        for (int i = 0; i < monton.toArray().length; i++) {
            baraja.add(monton.get(i));
        }
        monton.clear();
        Random random = new Random();
        Carta temp;
        int pos1, pos2;
        for (int i = 0; i < this.cartasDisponibles()/2; i++) {
            pos1 = random.nextInt(this.cartasDisponibles());
            pos2 = random.nextInt(this.cartasDisponibles());
            temp = baraja.get(pos1);
            baraja.set(pos1, baraja.get(pos2));
            baraja.set(pos2, temp);
        }
    }
    public void siguienteCarta(){
        if (this.cartasDisponibles() != 0){
            monton.add(baraja.getFirst());
            baraja.removeFirst();
        }else {
            System.out.println("No quedan cartas en la baraja. Vuelve a barajarlas");
        }
    }
    public int cartasDisponibles(){
        return baraja.toArray().length;
    }
    public void darCartas(int numCartas){
        if (this.cartasDisponibles() >= numCartas){
            for (int i = 0; i < numCartas; i++) {
                this.siguienteCarta();
            }
        }else {
            System.out.println("No quedan suficientes cartas en la baraja. Vuelve a barajarlas");
        }
    }
    public void cartasMonton(){
        System.out.println("Cartas sacadas en el montón");
        System.out.println("--------------------------------");
        for (int i = 0; i < monton.toArray().length; i++) {
            System.out.println(monton.get(i).getCarta());
        }
    }
    public void mostrarBaraja(){
        System.out.println("Cartas en la baraja");
        System.out.println("-----------------------");
        for (int i = 0; i < this.cartasDisponibles(); i++) {
            System.out.println(baraja.get(i).getCarta());
        }
    }
}
