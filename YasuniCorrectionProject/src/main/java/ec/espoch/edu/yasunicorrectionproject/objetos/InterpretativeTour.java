package ec.espoch.edu.yasunicorrectionproject.objetos;

public class InterpretativeTour extends Tour {

    private boolean EducationalTour;

    public InterpretativeTour(int idTour, String nameTour, SeveralTrail[] severalTrail, Device[] deviceTour, Guide[] guideTour) {
        super(idTour, nameTour, severalTrail, deviceTour, guideTour);
    }

    @Override
    public float getDifficultyTour() {
        return difficultyTour;
    }

    @Override
    public void setDifficultyTour(float difficultyTour) {
        this.difficultyTour = difficultyTour;
    }

    public boolean isEducationalTour() {
        return EducationalTour;
    }

    public void setEducationalTour(boolean EducationalTour) {
        this.EducationalTour = EducationalTour;
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

    @Override
    public String toString() {
        return "InterpretativeTour{" + "EducationalTour=" + EducationalTour + '}';
    }

}
