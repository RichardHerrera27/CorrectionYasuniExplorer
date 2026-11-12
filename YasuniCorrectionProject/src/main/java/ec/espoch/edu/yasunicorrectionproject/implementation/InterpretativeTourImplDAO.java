package ec.espoch.edu.yasunicorrectionproject.implementation;

import ec.espoch.edu.yasunicorrectionproject.interfaces.InterfazInterpretativeTourDAO;
import ec.espoch.edu.yasunicorrectionproject.objetos.SeveralTrail;

public class InterpretativeTourImplDAO implements InterfazInterpretativeTourDAO {

    @Override
    public void addDevice() {

    }

    @Override
    public void addGuide() {

    }

    @Override
    public void searchTrail(SeveralTrail[] trail, String nombreSendero) {

        boolean encontrado = false;

        for (int i = 0; i < trail.length; i++) {
            if (trail[i] != null && trail[i].getNameSeveralTrail().equalsIgnoreCase(nombreSendero)) {
                System.out.println("sendero encontrado en la posicion : " + i + " : ");
                System.out.println("Nombre: " + trail[i].getNameSeveralTrail());
                System.out.println("Longitud: " + trail[i].getLenghtTrail());

                encontrado = true;
                break;
            }

        }
        if (!encontrado) {
            System.out.println("no se encontro ningun sendero:" + nombreSendero);
        }

    }

    @Override
    public void sumarLongitudSendero(SeveralTrail[] trails) {
        float sumarTotal = 0;
        for (SeveralTrail trail : trails) {
            if (trail != null) {
                sumarTotal = sumarTotal + trail.getLenghtTrail();
            }
        }
        System.out.println("la longitud total de todos los senderos es: " + sumarTotal + "km");
    }

    @Override
    public void ordenarLongitudMayAMen(SeveralTrail[] trails) {
        int ordenar = trails.length;

        for (int i = 0; i < ordenar - 1; i++) {
            for (int j = 0; j < ordenar - i - 1; j++) {
                if (trails[j] != null && trails[j + 1] != null) {
                    if (trails[j].getLenghtTrail() > trails[j + 1].getLenghtTrail()) {
                        SeveralTrail temporarl = trails[j];
                        trails[j] = trails[j + 1];
                        trails[j + 1] = temporarl;
                    }
                }
            }
        }
        System.out.println("--Senderos ordenados de menor a mayor---");
        for (int i = 0; i < ordenar; i++) {
            if (trails[i] != null) {
                System.out.println(trails[i].getNameSeveralTrail() + " - " + trails[i].getLenghtTrail() + "km");
            }
        }
    }

}
