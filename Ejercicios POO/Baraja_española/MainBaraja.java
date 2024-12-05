public class MainBaraja {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        System.out.println("Hay "+baraja.cartasDisponibles()+" cartas disponibles");
        baraja.siguienteCarta();
        baraja.darCartas(8);
        System.out.println("Hay "+baraja.cartasDisponibles()+" cartas disponibles");
        baraja.cartasMonton();
        baraja.barajar();
        baraja.darCartas(5);
        baraja.cartasMonton();
    }
}
