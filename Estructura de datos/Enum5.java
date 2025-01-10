import javax.swing.JOptionPane;

public class Enum5 {
    enum MetodosPago {
        TARJETA_CREDITO("Tarjeta de credito"),
        PAYPAL("PayPal"),
        TRANSFERENCIA("Transferencia bancaria");

        private String descripcion;

        MetodosPago(String descripcion){
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static void main(String[] args) {
        int opcionPago = JOptionPane.showOptionDialog(null, "¿Cómo quieres pagar?", "Metodos de pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, MetodosPago.values(),0);
        switch (opcionPago){
            case 0:
                System.out.println("Se ha cobrado con: "+MetodosPago.TARJETA_CREDITO.getDescripcion());
                break;
            case 1:
                System.out.println("Se ha cobrado con: "+MetodosPago.PAYPAL.getDescripcion());
                break;
            case 2:
                System.out.println("Se ha cobrado con: "+MetodosPago.TRANSFERENCIA.getDescripcion());
                break;
        }
    }
}
