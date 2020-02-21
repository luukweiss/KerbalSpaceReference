package nl.weiss.kerbalspacereferenceguide.datamodel.kerbin_system;

import nl.weiss.kerbalspacereferenceguide.datamodel.planetInterface;

public class Kerbin implements planetInterface {

    private static final String PLANET_NAME = "Kerbin";
    private static final int ATMOSPHERE_HEIGHT_IN_KM = 70;


    @Override
    public String getName() {
        return PLANET_NAME;
    }

    @Override
    public int getAtmosphereInKm() {
        return ATMOSPHERE_HEIGHT_IN_KM;
    }
}
