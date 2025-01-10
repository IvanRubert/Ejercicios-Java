public class Enum1 {
    enum Nivel {
        ADMINISTRADOR("Alto"),
        MODERADOR("Medio"),
        USUARIO_REGULAR("Bajo"),
        INVITADO("Ninguno");

        private String descripcion;

        Nivel(String descripcion){
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }
    public static void main(String[] args) {
        Nivel p1 = Nivel.ADMINISTRADOR;
        Nivel p2 = Nivel.MODERADOR;
        Nivel p3 = Nivel.USUARIO_REGULAR;
        Nivel p4 = Nivel.INVITADO;

        System.out.println("Nivel "+p1+": Acceso "+p1.getDescripcion());
        System.out.println("Nivel "+p2+": Acceso "+p2.getDescripcion());
        System.out.println("Nivel "+p3+": Acceso "+p3.getDescripcion());
        System.out.println("Nivel "+p4+": Acceso "+p4.getDescripcion());
    }
}
