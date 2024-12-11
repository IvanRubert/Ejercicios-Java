public class Pelicula extends Multimedia{
    String actor, actriz;

    public Pelicula(String titulo, String autor, String formato, float duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null){
            throw new IllegalArgumentException("Has de indicar un actor o actriz");
        }
        this.actor = actor;
        this.actriz = actriz;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActor() {
        return actor;
    }
    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        if (actriz == null || actriz.isEmpty()){
            return super.toString()+"\nActor principal: "+ actor;
        } else if (actor == null || actor.isEmpty()) {
            return super.toString()+"\nActriz principal: "+ actriz;
        } else {
            return super.toString() + "\nActor principal: " + actor + "\nActriz principal: " + actriz;
        }
    }
}
