package ec.espoch.edu.yasunicorrectionproject.implementation;

import ec.espoch.edu.yasunicorrectionproject.objetos.Guide;

public class GuideImplDAO {

    public void asignarIdGuide(Guide guide) {

    }

    public void obtenerIdGuide(Guide guide) {
        System.out.println("el id del guia es: " + guide.getNameGuide());
    }

    public void cambiarIdGuide(Guide guide) {

    }

    public void obtenerNombreGuide(Guide guide) {
        System.out.println("el nombre del guia es : " + guide.getNameGuide());
    }

    public void modificarNombreGuide() {

    }

    public void estadoGuia(Guide guide) {
        guide.isStateGuide();
    }

}
