package ec.espoch.edu.yasunicorrectionproject.objetos;

public class RegularTour extends Tour {

    public RegularTour(int idTour, String nameTour, SeveralTrail[] severalTrail, Device[] deviceTour, Guide[] guideTour) {
        super(idTour, nameTour, severalTrail, deviceTour, guideTour);
    }

    public RegularTour() {
    }

    @Override
    public float getDifficultyTour() {
        return difficultyTour;
    }

    @Override
    public void setDifficultyTour(float difficultyTour) {
        this.difficultyTour = difficultyTour;
    }

    @Override
    public Device[] getDeviceTour() {
        return deviceTour;
    }

    @Override
    public void setDeviceTour(Device[] deviceTour) {
        this.deviceTour = deviceTour;
    }

    @Override
    public Guide[] getGuideTour() {
        return guideTour;
    }

    @Override
    public void setGuideTour(Guide[] guideTour) {
        this.guideTour = guideTour;
    }

}
