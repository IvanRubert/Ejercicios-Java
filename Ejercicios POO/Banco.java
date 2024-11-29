public class Banco {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("Pepe", "ES123456789");
        CuentaBancaria c2 = new CuentaBancaria("Juan", "ES987654321", 20);

        c1.ingreso(99.9f);
        c2.ingreso(20.1f);

        c1.retirada(50);
        c2.retirada(10);

        System.out.println("Dinero en la cuenta "+c1.getNumCuenta()+" con titular "+c1.getTitular()+" tiene: "+c1.dineroEnCuenta());
        System.out.println("Dinero en la cuenta "+c2.getNumCuenta()+" con titular "+c2.getTitular()+" tiene: "+c2.dineroEnCuenta());
    }
}
