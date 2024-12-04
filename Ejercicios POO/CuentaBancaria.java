import java.text.DecimalFormat;

public class CuentaBancaria {
    private String titular;
    private String numCuenta;
    private float saldo;

    public CuentaBancaria(String nombre, String num){
        titular = nombre;
        numCuenta = num;
    }
    public CuentaBancaria(String nombre, String num, float dinero){
        titular = nombre;
        numCuenta = num;
        saldo = dinero;
    }

    public void setTitular(String nombre) {
        titular = nombre;
    }
    public String getTitular() {
        return titular;
    }
    public void setNumCuenta(String num) {
        numCuenta = num;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setSaldo(float dinero) {
        saldo = dinero;
    }
    public float getSaldo() {
        return saldo;
    }

    public void ingreso(float dinero){
        if (dinero>0){
            saldo+=dinero;
            System.out.println("Se ha ingresado "+dinero+"€ a tu cuenta: "+numCuenta);
        }else{
            System.out.println("Error no se puede ingresar dinero negativo");
        }
    }
    public void retirada(float dinero){
        if (dinero<0){
            System.out.println("No se puede retirar dinero negativo");
        } else if (saldo<dinero) {
            System.out.println("Error: No tienes esa cantidad de dinero en tu cuenta: "+numCuenta);
        } else {
            saldo-=dinero;
            System.out.println("Se ha retirado "+dinero+"€ de la cuenta "+numCuenta);
        }
    }
    public String datos(){
        DecimalFormat formato = new DecimalFormat("#.##");
        return "El titular "+titular+" tiene "+formato.format(saldo)+"€ en la cuenta"+ numCuenta;
    }
}
