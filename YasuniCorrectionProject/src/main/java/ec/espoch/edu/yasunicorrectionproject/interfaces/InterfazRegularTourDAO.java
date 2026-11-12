package ec.espoch.edu.yasunicorrectionproject.interfaces;

import ec.espoch.edu.yasunicorrectionproject.objetos.Device;
import ec.espoch.edu.yasunicorrectionproject.objetos.Guide;
import ec.espoch.edu.yasunicorrectionproject.objetos.RegularTour;
import ec.espoch.edu.yasunicorrectionproject.objetos.SeveralTrail;

public interface InterfazRegularTourDAO {

    public void verTour(RegularTour regularTour);

    public void verNombreTour(RegularTour regularTour);

    public float calculateDistance(SeveralTrail[] severalTrail);

    public void addDevice(Device[] device);

    public void addGuide(Guide[] guide);

}
