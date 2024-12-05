public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private int matriculacion;
    private boolean isElectrico;

    public Coche(){
    }
    public Coche(String matricula){
        this.matricula = matricula;
    }
    public Coche(String matricula, String marca, String modelo, int matriculacion, boolean isElectrico){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.matriculacion = matriculacion;
        this.isElectrico = isElectrico;
    }
    public Coche(Coche coche){
        matricula = coche.matricula;
        marca = coche.marca;
        modelo = coche.modelo;
        matriculacion = coche.matriculacion;
        isElectrico = coche.isElectrico;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setMatriculacion(int matriculacion) {
        this.matriculacion = matriculacion;
    }
    public int getMatriculacion() {
        return matriculacion;
    }
    public void setElectrico(boolean electrico) {
        isElectrico = electrico;
    }
    public boolean isElectrico() {
        return isElectrico;
    }

    public String datos(){
        String electrico;
        if (isElectrico){electrico = "SI";} else {electrico = "NO";}
        return matricula +" "+marca+" "+modelo+" "+matriculacion+" Eléctrico: "+electrico;
    }
}
