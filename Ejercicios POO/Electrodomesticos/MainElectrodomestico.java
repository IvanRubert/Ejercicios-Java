public class MainElectrodomestico {
    public static void main(String[] args) {
        Electrodomestico[] arrayElectro = new Electrodomestico[10];
        String[] infoElectro = new String[10];

        Microondas m = new Microondas();
        arrayElectro[0] = m;
        infoElectro[0] = m.toString();
        Lavavajillas l = new Lavavajillas();
        arrayElectro[1] = l;
        infoElectro[1] = l.toString();

        m = new Microondas(400f, "Gris");
        arrayElectro[2] = m;
        infoElectro[2] = m.toString();
        l = new Lavavajillas(500, "negro");
        arrayElectro[3] = l;
        infoElectro[3] = l.toString();

        m = new Microondas(250.5f, null, 'A', 9);
        arrayElectro[4] = m;
        infoElectro[4] = m.toString();
        l = new Lavavajillas(500.23f, "blanco", 'Z', 9);
        arrayElectro[5] = l;
        infoElectro[5] = l.toString();

        m = new Microondas(650.6f, "amarillo", 'B', 19);
        arrayElectro[6] = m;
        infoElectro[6] = m.toString();
        l = new Lavavajillas(110, "rojo", 'e', 6);
        arrayElectro[7] = l;
        infoElectro[7] = l.toString();

        m = new Microondas(200.5f, "MARRON", 'd', 15);
        arrayElectro[8] = m;
        infoElectro[8] = m.toString();
        l = new Lavavajillas(300, "NEGRO", 'E', 12);
        arrayElectro[9] = l;
        infoElectro[9] = l.toString();

        float sumaPrecios = 0;
        for (int i = 0; i < infoElectro.length; i++) {
            sumaPrecios += arrayElectro[i].precioFinal();
            System.out.println(infoElectro[i]);
        }
        System.out.println("Suma de todos los precios finales: "+sumaPrecios+"€");
    }
}
