package ec.espoch.edu.yasunicorrectionproject.implementation;

import ec.espoch.edu.yasunicorrectionproject.objetos.Device;

public class DeviceImplDAO {

    public void cambiarIdDevice(Device device) {
        System.out.println("el codigo del dispositivo es: " + device.getCodeDevice());
    }

    public void cambiarNombreDevice(Device device) {
        System.out.println("la descripcion es: " + device.getDescriptionDevice());
    }

    public void asignarDevice(Device device) {
        device.isStateDevice();
    }

    public void agregarDevice() {

    }

    public void borrarDevice() {

    }

}
