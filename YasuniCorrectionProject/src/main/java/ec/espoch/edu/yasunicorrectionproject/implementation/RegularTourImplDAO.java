package ec.espoch.edu.yasunicorrectionproject.implementation;

import ec.espoch.edu.yasunicorrectionproject.interfaces.InterfazRegularTourDAO;
import ec.espoch.edu.yasunicorrectionproject.objetos.Device;
import ec.espoch.edu.yasunicorrectionproject.objetos.Guide;
import ec.espoch.edu.yasunicorrectionproject.objetos.RegularTour;
import ec.espoch.edu.yasunicorrectionproject.objetos.SeveralTrail;
import ec.espoch.edu.yasunicorrectionproject.objetos.Tour;

public class RegularTourImplDAO extends TourImplDAO implements InterfazRegularTourDAO {

    @Override
    public void verTour(RegularTour regularTour) {

    }

    @Override
    public void verNombreTour(RegularTour regularTour) {

    }

    @Override
    public float calculateDistance(SeveralTrail[] severalTrail) {
        float sumaSenderos = 0;

        SeveralTrail[] severalTrails;
        severalTrails = new SeveralTrail[4];

        for (SeveralTrail severalTrail1 : severalTrails) {
            sumaSenderos = sumaSenderos + severalTrail1.getLenghtTrail();
        }
        System.out.println("la suma de los senderos es: " + sumaSenderos);
        return sumaSenderos;
    }

    @Override
    public void addDevice(Device[] device) {

        System.out.println("dispositivo add");
    }

    @Override
    public void addGuide(Guide[] guide) {
        System.out.println("guia add");
    }

}
