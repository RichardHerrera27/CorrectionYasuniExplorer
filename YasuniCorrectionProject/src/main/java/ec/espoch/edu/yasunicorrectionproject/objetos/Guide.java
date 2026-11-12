package ec.espoch.edu.yasunicorrectionproject.objetos;

public class Guide {

    private int idGuide;
    private String nameGuide;
    private boolean stateGuide;

    public Guide(int idGuide, String nameGuide, boolean stateGuide) {
        this.idGuide = idGuide;
        this.nameGuide = nameGuide;
        this.stateGuide = stateGuide;
    }

    public int getIdGuide() {
        return idGuide;
    }

    public void setIdGuide(int idGuide) {
        this.idGuide = idGuide;
    }

    public String getNameGuide() {
        return nameGuide;
    }

    public void setNameGuide(String nameGuide) {
        this.nameGuide = nameGuide;
    }

    public boolean isStateGuide() {
        return stateGuide;
    }

    public void setStateGuide(boolean stateGuide) {
        this.stateGuide = stateGuide;
    }

    @Override
    public String toString() {
        return "Guide{" + "idGuide=" + idGuide   + ", nameGuide=" + nameGuide + ", stateGuide=" + stateGuide + '}';
    }

   }
