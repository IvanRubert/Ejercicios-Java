public class Enum3 {
    enum EstadoPedido {
        PENDIENTE("El pedido esta pendiente de procesarse"),
        PROCESANDO("El pedido se está procesando"),
        ENVIADO("El pedido se ha enviado"),
        ENTREGADO("El pedido se ha entregado");

        private String descripcion;

        EstadoPedido(String descripcion){
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }

    }

    public static void main(String[] args) {
        Pedido p1 = new Pedido("PED1");
        try {
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.PROCESANDO);
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.ENVIADO);
            Thread.sleep(2000);
            p1.cambiarEstado(EstadoPedido.ENTREGADO);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class Pedido{
        private String codigo;

        private EstadoPedido estado;

        public Pedido(String codigo){
            this.codigo = codigo;
            estado = EstadoPedido.PENDIENTE;
            System.out.println(estado.getDescripcion());
        }
        public void cambiarEstado(EstadoPedido estado){
            this.estado = estado;
            System.out.println(this.estado.getDescripcion());
        }

    }
}
