package ec.espoch.edu.yasunicorrectionproject.objetos;

public class Tour {

    private int idTour;
    private String nameTour;
    protected float difficultyTour = 1.0f;

    private SeveralTrail[] severalTrail;

    protected Device[] deviceTour;
    protected Guide[] guideTour;

    public Tour(int idTour, String nameTour, SeveralTrail[] severalTrail, Device[] deviceTour, Guide[] guideTour) {
        this.idTour = idTour;
        this.nameTour = nameTour;
        this.severalTrail = severalTrail;
        this.deviceTour = deviceTour;
        this.guideTour = guideTour;
    }

    public Tour() {

    }

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getNameTour() {
        return nameTour;
    }

    public void setNameTour(String nameTour) {
        this.nameTour = nameTour;
    }

    public float getDifficultyTour() {
        return difficultyTour;
    }

    public void setDifficultyTour(float difficultyTour) {
        this.difficultyTour = difficultyTour;
    }

    public SeveralTrail[] getSeveralTrail() {
        return severalTrail;
    }

    public void setSeveralTrail(SeveralTrail[] severalTrail) {
        this.severalTrail = severalTrail;
    }

    public Device[] getDeviceTour() {
        return deviceTour;
    }

    public void setDeviceTour(Device[] deviceTour) {
        this.deviceTour = deviceTour;
    }

    public Guide[] getGuideTour() {
        return guideTour;
    }

    public void setGuideTour(Guide[] guideTour) {
        this.guideTour = guideTour;
    }

    @Override
    public String toString() {
        return "Tour{" + "idTour=" + idTour + ", nameTour=" + nameTour + ", difficultyTour=" + difficultyTour + ", severalTrail=" + severalTrail + ", deviceTour=" + deviceTour + ", guideTour=" + guideTour + '}';
    }

}
