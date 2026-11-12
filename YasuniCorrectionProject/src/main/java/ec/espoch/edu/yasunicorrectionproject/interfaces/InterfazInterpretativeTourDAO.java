package ec.espoch.edu.yasunicorrectionproject.interfaces;

import ec.espoch.edu.yasunicorrectionproject.objetos.SeveralTrail;

public interface InterfazInterpretativeTourDAO {

    public void addDevice();

    public void addGuide();

    public void searchTrail(SeveralTrail[] trail, String nombreSendero);
    
    public void sumarLongitudSendero(SeveralTrail[] trails);
    
    public void ordenarLongitudMayAMen(SeveralTrail[] trails);
}
