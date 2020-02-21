package nl.weiss.kerbalspacereferenceguide.datamodel.kerbin_system;

import java.util.ArrayList;
import java.util.List;

import nl.weiss.kerbalspacereferenceguide.datamodel.MoonInterface;
import nl.weiss.kerbalspacereferenceguide.datamodel.PlanetInterface;

/**
 * For all planets implement a custom class; However it would be
 */
public class Kerbin implements PlanetInterface {

    private static final String PLANET_NAME = "Kerbin";
    private static final int ATMOSPHERE_HEIGHT_IN_KM = 70;
    private static final String SEMI_SYNCHRONOUS_ORBIT_PERIOD = "2H:59M:34.7S";
    private static final double SEMI_SYNCHRONOUS_ORBIT_VELOCITY = 1272.28;
    private static final double GEO_STATIONARY_ORBIT_ALTITUDE = 2863.33;
    private static final int LOW_ORBIT_ALTITUDE_IN_KM = 80;

    // should be based on the soi edge of parent planet or interplanetary transfer from the base planet (as seen from start - kerbin)
    private int DETLAV_BASE_FROM_SOI_EDGE = 0;

    private static final int DELTAV_FOR_LOW_ORBIT = 3400;
    private static final int DELTAV_FOR_INTERCEPT = 0;
    private static final int DELTAV_FOR_SOI_EDGE_ORBIT = 0;
    private static final boolean AEROBRAKING_POSSIBLE_FOR_PLANET = true;

    private static final boolean HAS_MOONS = true;
    private static final ArrayList<MoonInterface> moons = new ArrayList<MoonInterface>(List.of());


    @Override
    public String getName() {
        return PLANET_NAME;
    }

    @Override
    public int getAtmosphereInKm() {
        return ATMOSPHERE_HEIGHT_IN_KM;
    }

    @Override
    public int getAtmosphereInMeters() {
        return (ATMOSPHERE_HEIGHT_IN_KM * 1000);
    }

    @Override
    public String getSemiSynchronousObritPeriod() {
        return SEMI_SYNCHRONOUS_ORBIT_PERIOD;
    }

    @Override
    public double getOrbitalVelocity() {
        return SEMI_SYNCHRONOUS_ORBIT_VELOCITY;
    }

    @Override
    public double getGeostationaryOrbitAltitude() {
        return GEO_STATIONARY_ORBIT_ALTITUDE;
    }

    @Override
    public int getLowOrbitAltitude() {
        return LOW_ORBIT_ALTITUDE_IN_KM;
    }

    @Override
    public int getDeltaVForLowOrbit() {
        return 3400;
    }

    @Override
    public int getDeltaVForSOIEdge() {
        return 0;
    }

    @Override
    public int getDeltaVForIntercept() {
        return 0;
    }

    @Override
    public boolean AerobrakingPossible() {
        return false;
    }
}
