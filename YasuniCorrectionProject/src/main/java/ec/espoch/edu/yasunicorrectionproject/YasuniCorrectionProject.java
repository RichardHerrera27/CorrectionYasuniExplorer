package ec.espoch.edu.yasunicorrectionproject;

import ec.espoch.edu.yasunicorrectionproject.implementation.InterpretativeTourImplDAO;
import ec.espoch.edu.yasunicorrectionproject.implementation.RegularTourImplDAO;
import ec.espoch.edu.yasunicorrectionproject.implementation.TourImplDAO;
import ec.espoch.edu.yasunicorrectionproject.interfaces.InterfazInterpretativeTourDAO;
import ec.espoch.edu.yasunicorrectionproject.interfaces.InterfazRegularTourDAO;
import ec.espoch.edu.yasunicorrectionproject.objetos.Device;
import ec.espoch.edu.yasunicorrectionproject.objetos.Guide;
import ec.espoch.edu.yasunicorrectionproject.objetos.RegularTour;
import ec.espoch.edu.yasunicorrectionproject.objetos.SeveralTrail;
import ec.espoch.edu.yasunicorrectionproject.objetos.Tour;
import java.util.Arrays;

public class YasuniCorrectionProject {

    public static void main(String[] args) {

        System.out.println("----WELCOME TO SYSTEM TOUR----");

        SeveralTrail[] vectorTrail;
        vectorTrail = new SeveralTrail[4];
        vectorTrail[0] = new SeveralTrail("SenderoCoca", 2.0f, 60.0f, true);
        
        System.out.println(vectorTrail[0]);
        String nameSendero = vectorTrail[0].getNameSeveralTrail();
        float distancia = vectorTrail[0].getLenghtTrail();

        Device[] device;
        device = new Device[4];
        device[0] = new Device(0, nameSendero, true);

        Guide[] guides;
        guides = new Guide[4];
        guides[0] = new Guide(0, nameSendero, true);

        Tour[] tour;
        tour = new Tour[4];
        tour[0] = new RegularTour(0, nameSendero, vectorTrail, device, guides);

        InterfazRegularTourDAO tourDAO = new RegularTourImplDAO();
        tourDAO.addDevice(device);
        tourDAO.addGuide(guides);

        InterfazInterpretativeTourDAO interpretativeTourDAO = new InterpretativeTourImplDAO();
        interpretativeTourDAO.searchTrail(vectorTrail, "SenderoCoca");
        
        interpretativeTourDAO.sumarLongitudSendero(vectorTrail);

    }
}
