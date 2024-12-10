public class Pelicula extends Multimedia{
    String actorP, actorS;

    public Pelicula(String titulo, String autor, String formato, float duracion, String actorPrincipal) {
        super(titulo, autor, formato, duracion);
        actorP = actorPrincipal;
    }
    public Pelicula(String titulo, String autor, String formato, float duracion, String actorPrincipal, String actorSecundario) {
        super(titulo, autor, formato, duracion);
        actorP = actorPrincipal;
        actorS = actorSecundario;
    }

    public void setActorP(String actorP) {
        this.actorP = actorP;
    }
    public String getActorP() {
        return actorP;
    }
    public void setActorS(String actorS) {
        this.actorS = actorS;
    }
    public String getActorS() {
        return actorS;
    }

    @Override
    public String toString() {
        if (actorS == null || actorS.isEmpty()){
            return super.toString()+"\nActor Principal: "+actorP;
        }else {
            return super.toString() + "\nActor Principal: " + actorP + "\nActor Secundario: " + actorS;
        }
    }
}
