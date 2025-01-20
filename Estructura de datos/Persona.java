public class Persona {
    private String nombre;
    private String apellido;
    private int yearNacimiento;

    public Persona(String nombre, String apellido, int year){
        this.nombre = nombre;
        this.apellido = apellido;
        yearNacimiento = year;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getYearNacimiento() {
        return yearNacimiento;
    }
}
