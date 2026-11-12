package ec.espoch.edu.yasunicorrectionproject.objetos;

public class SeveralTrail {

    private String NameSeveralTrail;
    private float lenghtTrail;
    private float timeWalkTrail;
    private boolean trailState;

    public SeveralTrail(String NameSeveralTrail, float lenghtTrail, float timeWalkTrail, boolean trailState) {
        this.NameSeveralTrail = NameSeveralTrail;
        this.lenghtTrail = lenghtTrail;
        this.timeWalkTrail = timeWalkTrail;
        this.trailState = trailState;
    }

    public String getNameSeveralTrail() {
        return NameSeveralTrail;
    }

    public void setNameSeveralTrail(String NameSeveralTrail) {
        this.NameSeveralTrail = NameSeveralTrail;
    }

    public float getLenghtTrail() {
        return lenghtTrail;
    }

    public void setLenghtTrail(float lenghtTrail) {
        this.lenghtTrail = lenghtTrail;
    }

    public float getTimeWalkTrail() {
        return timeWalkTrail;
    }

    public void setTimeWalkTrail(float timeWalkTrail) {
        this.timeWalkTrail = timeWalkTrail;
    }

    public boolean isTrailState() {
        return trailState;
    }

    public void setTrailState(boolean trailState) {
        this.trailState = trailState;
    }

    public boolean TrailState() {
        return true;
    }

    @Override
    public String toString() {
        return "SeveralTrail{" + "NameSeveralTrail=" + NameSeveralTrail + ", lenghtTrail=" + lenghtTrail + ", timeWalkTrail=" + timeWalkTrail + ", trailState=" + trailState + '}';
    }

}
