public class PersonaMain {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Pepe", 18, 'M');
        Persona p3 = new Persona("Pepita", 60, 'F', 50.3f, 1.6f);

        p1.setNombre("Juan");
        p1.setEdad(12);
        p1.setPeso(40);
        p1.setAltura(1.30f);
        p2.setPeso(80.5f);
        p2.setAltura(1.75f);

        System.out.println("Datos");
        System.out.println(p1.datos());
        System.out.println("Segun su IMC, "+p1.getNombre()+" está: "+resultadoIMC(p1));
        System.out.println(p2.datos());
        System.out.println("Segun su IMC, "+p2.getNombre()+" está: "+resultadoIMC(p2));
        System.out.println(p3.datos());
        System.out.println("Segun su IMC, "+p3.getNombre()+" está: "+resultadoIMC(p3));
    }
    private static String resultadoIMC(Persona p){
        if (p.calcularIMC() == Persona.PESO_BAJO){
            return "Por debajo de su peso ideal";
        } else if (p.calcularIMC() == Persona.PESO_IDEAL) {
            return "En su peso ideal";
        } else if (p.calcularIMC() == Persona.PESO_ALTO) {
            return "Con sobrepeso";
        } else {
            return "No se pudo calcular";
        }
    }
}
