public class Enum6 {
    enum EstadoPedido {
        RECIBIDO("Pedido recibido"),
        PREPARACION("En preparación"),
        LISTO("Listo para servir"),
        ENTREGADO("Entregado");

        private String descripcion;

        EstadoPedido(String descripcion){
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static void main(String[] args) {
        PedidoRestaurante p1 = new PedidoRestaurante();
        try {
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.PREPARACION);
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.LISTO);
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.ENTREGADO);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class PedidoRestaurante{
        private EstadoPedido estado;

        public PedidoRestaurante(){
            estado = EstadoPedido.RECIBIDO;
            System.out.println(estado.getDescripcion());
        }
        public void cambiarEstado(EstadoPedido estado){
            this.estado = estado;
            System.out.println(this.estado.getDescripcion());
        }

    }
}
