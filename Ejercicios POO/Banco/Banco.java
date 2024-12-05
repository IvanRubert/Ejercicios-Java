public class Banco {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Pepe", "ES123456789");
        CuentaBancaria c2 = new CuentaBancaria("Juan", "ES987654321", 20);

        c1.ingreso(99.9f);
        c2.ingreso(20.1f);

        c1.retirada(50);
        c2.retirada(10);

        System.out.println(c1.datos());
        System.out.println(c2.datos());
    }
}
