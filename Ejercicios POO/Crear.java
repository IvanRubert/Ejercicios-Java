class Crear {
    public static void main(String[] args) { // metodo main
        Pajaro2 p = new Pajaro2();
        Pajaro2 p2 = new Pajaro2('v', 3);
        p.setEdad(5);
        System.out.println("Color: " +p.printColor());
        System.out.println("Edad: " +p.devuelveEdad());
        System.out.println("Color: " +p2.printColor());
        System.out.println("Edad: " +p2.devuelveEdad());
        System.out.println("Numeros pajaro: " +p.printNumPajaros());
        System.out.println("Suma edad: " + p.sumaEdades(p,p2,p));
    }
}