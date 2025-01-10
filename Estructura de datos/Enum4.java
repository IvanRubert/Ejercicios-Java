public class Enum4 {
    enum DiasSemana {
        LUNES("laborable"),
        MARTES("laborable"),
        MIERCOLES("laborable"),
        JUEVES("laborable"),
        VIERNES("laborable"),
        SABADO("fin de semana"),
        DOMINGO("fin de semana");

        private String esLaborable;

        DiasSemana(String descripcion){
            esLaborable = descripcion;
        }

        public String getEsLaborable() {
            return esLaborable;
        }
    }

    public static void main(String[] args) {
        DiasSemana d1 = DiasSemana.LUNES;
        DiasSemana d2 = DiasSemana.MARTES;
        DiasSemana d3 = DiasSemana.MIERCOLES;
        DiasSemana d4 = DiasSemana.JUEVES;
        DiasSemana d5 = DiasSemana.VIERNES;
        DiasSemana d6 = DiasSemana.SABADO;
        DiasSemana d7 = DiasSemana.DOMINGO;

        System.out.println("El "+d1+" es "+d1.getEsLaborable());
        System.out.println("El "+d2+" es "+d2.getEsLaborable());
        System.out.println("El "+d3+" es "+d3.getEsLaborable());
        System.out.println("El "+d4+" es "+d4.getEsLaborable());
        System.out.println("El "+d5+" es "+d5.getEsLaborable());
        System.out.println("El "+d6+" es "+d6.getEsLaborable());
        System.out.println("El "+d7+" es "+d7.getEsLaborable());
    }
}
