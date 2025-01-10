public class Enum2 {
    enum Prioridad {
        ALTA(1),
        MEDIA(0),
        BAJA(-1);

        private int prioridad;

        Prioridad(int prioridad) {
            this.prioridad = prioridad;
        }

        public int getPrioridad() {
            return prioridad;
        }
    }

    public static void main(String[] args) {
        Prioridad p1 = Prioridad.ALTA;
        Prioridad p2 = Prioridad.BAJA;
        Prioridad p3 = Prioridad.MEDIA;

        System.out.println(mostrarPrioridad(p1));
        System.out.println(mostrarPrioridad(p2));
        System.out.println(mostrarPrioridad(p3));
    }

    private static String mostrarPrioridad(Prioridad p){
        switch (p){
            case ALTA -> {
                return "Prioridad Alta";
            }
            case MEDIA -> {
                return "Prioridad Media";
            }
            case BAJA -> {
                return "Prioridad Baja";
            }
        }
        return "";
    }
}
