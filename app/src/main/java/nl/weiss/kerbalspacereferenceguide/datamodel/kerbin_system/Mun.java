package nl.weiss.kerbalspacereferenceguide.datamodel.kerbin_system;

import nl.weiss.kerbalspacereferenceguide.datamodel.MoonInterface;

public class Mun implements MoonInterface {

    private static final String PLANET_NAME = "Mun";
    private static final String DESCRIPTION = "The mun is the clostest and biggest moon of Kerbin. It is really hard to land on but the views can be amazing!";
    private static final int ATMOSPHERE_HEIGHT_IN_KM = 70;
    private static final String SEMI_SYNCHRONOUS_ORBIT_PERIOD = "2H:59M:34.7S";
    private static final double SEMI_SYNCHRONOUS_ORBIT_VELOCITY = 1272.28;
    private static final double GEO_STATIONARY_ORBIT_ALTITUDE = 2863.33;
    private static final int LOW_ORBIT_ALTITUDE_IN_KM = ATMOSPHERE_HEIGHT_IN_KM + 10; // + 10 kilometers for having a safe low planetary orbit

    // all values for deltaV will be safe and thus be *1.5 to match messiness of the real (simulated) world :p
    private static final double SAFE_DELTAV_MODIFIER = 1.5;

    // should be based on the soi edge of parent planet or interplanetary transfer from the base planet (as seen from start - kerbin)
//    private double DETLAV_BASE_FROM_SOI_EDGE = DELTAV_FOR_LOW_ORBIT + 930;

    private static final double DELTAV_FOR_LOW_ORBIT = 3400;
    private static final double DELTAV_FOR_INTERCEPT = 0;
    private static final double DELTAV_FOR_SOI_EDGE_ORBIT = DELTAV_FOR_LOW_ORBIT + 930;
    private static final boolean AEROBRAKING_POSSIBLE_FOR_PLANET = true;

    private static final int DELTAV_FOR_KEOSTATIONARY_ORBIT = 1115; // only for kerbin

    private static final boolean HAS_MOONS = true;


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int getAtmosphereInKm() {
        return 0;
    }

    @Override
    public int getAtmosphereInMeters() {
        return 0;
    }

    @Override
    public String getSemiSynchronousObritPeriod() {
        return null;
    }

    @Override
    public double getOrbitalVelocity() {
        return 0;
    }

    @Override
    public double getGeostationaryOrbitAltitude() {
        return 0;
    }

    @Override
    public double getLowOrbitAltitude() {
        return 0;
    }

    @Override
    public double getDeltaVForLowOrbit() {
        return 0;
    }

    @Override
    public double getDeltaVForSOIEdge() {
        return 0;
    }

    @Override
    public double getDeltaVForIntercept() {
        return 0;
    }

    @Override
    public boolean hasAerobreakingPossibility() {
        return false;
    }
}
