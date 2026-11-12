package ec.espoch.edu.yasunicorrectionproject.implementation;

import ec.espoch.edu.yasunicorrectionproject.objetos.Device;
import ec.espoch.edu.yasunicorrectionproject.objetos.Guide;
import ec.espoch.edu.yasunicorrectionproject.objetos.RegularTour;
import ec.espoch.edu.yasunicorrectionproject.objetos.Tour;

public class TourImplDAO extends Tour {

    public void addGuide(Guide guide) {
        if(guide.isStateGuide()){
            System.out.println("guia activo");
        }
    }

    public void addDevice(Device device) {
        if(device.isStateDevice()){
            System.out.println("dispositivo activo");
        }
    }
}
