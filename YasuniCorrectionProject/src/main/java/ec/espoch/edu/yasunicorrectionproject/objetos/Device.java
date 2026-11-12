package ec.espoch.edu.yasunicorrectionproject.objetos;

public class Device {

    private int codeDevice;
    private String descriptionDevice;
    private boolean stateDevice;

    public Device(int codeDevice, String descriptionDevice, boolean stateDevice) {
        this.codeDevice = codeDevice;
        this.descriptionDevice = descriptionDevice;
        this.stateDevice = stateDevice;
    }

    public int getCodeDevice() {
        return codeDevice;
    }

    public void setCodeDevice(int codeDevice) {
        this.codeDevice = codeDevice;
    }

    public String getDescriptionDevice() {
        return descriptionDevice;
    }

    public void setDescriptionDevice(String descriptionDevice) {
        this.descriptionDevice = descriptionDevice;
    }

    public boolean isStateDevice() {
        return stateDevice;
    }

    public void setStateDevice(boolean stateDevice) {
        this.stateDevice = stateDevice;
    }

    @Override
    public String toString() {
        return "Guide{" + "codeDevice=" + codeDevice + ", descriptionDevice=" + descriptionDevice + ", stateDevice=" + stateDevice + '}';
    }
}
