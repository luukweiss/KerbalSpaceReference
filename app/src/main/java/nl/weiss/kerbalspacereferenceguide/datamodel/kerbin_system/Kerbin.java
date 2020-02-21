package nl.weiss.kerbalspacereferenceguide.datamodel.kerbin_system;

import java.util.List;

import nl.weiss.kerbalspacereferenceguide.datamodel.MoonInterface;
import nl.weiss.kerbalspacereferenceguide.datamodel.PlanetInterface;

/**
 * For all planets implement a custom class.
 *
 * Kerbin is the home planet of the kerbals. It has 2 moons and will require the most delta V to get in orbit to. From Kerbin on out it is an easy ride. It is also one of the planets that
 * has its geostationary orbit described and has 
 */
public class Kerbin implements PlanetInterface {

    private static Kerbin kerbin_instance = null;

    private static final String PLANET_NAME = "Kerbin";
    private static final int ATMOSPHERE_HEIGHT_IN_KM = 70;
    private static final String SEMI_SYNCHRONOUS_ORBIT_PERIOD = "2H:59M:34.7S";
    private static final double SEMI_SYNCHRONOUS_ORBIT_VELOCITY = 1272.28;
    private static final double GEO_STATIONARY_ORBIT_ALTITUDE = 2863.33;
    private static final int LOW_ORBIT_ALTITUDE_IN_KM = ATMOSPHERE_HEIGHT_IN_KM + 10; // + 10 kilometers for having a safe low planetary orbit

    // all values for deltaV will be safe and thus be *1.5 to match messiness of the real (simulated) world :p
    private static final double SAFE_DELTAV_MODIFIER = 1.5;

    // should be based on the soi edge of parent planet or interplanetary transfer from the base planet (as seen from start - kerbin)
    private int DETLAV_BASE_FROM_SOI_EDGE = 0;

    private static final double DELTAV_FOR_LOW_ORBIT = 3400;
    private static final double DELTAV_FOR_INTERCEPT = 0;
    private static final double DELTAV_FOR_SOI_EDGE_ORBIT = 0;
    private static final boolean AEROBRAKING_POSSIBLE_FOR_PLANET = true;

    private static final int DELTAV_FOR_KEOSTATIONARY_ORBIT = 1115; // only for kerbin

    private static final boolean HAS_MOONS = true;

    private List<MoonInterface> MOONS;

    private Kerbin() {
        // todo do init for moons
    }

    /**
     * Get the current kerbin instance. Will dynamically create the moons at init
     * @return The kerbin instance
     */
    public static Kerbin getInstance() {
        if (kerbin_instance == null) {
            kerbin_instance = new Kerbin();
        }
        return kerbin_instance;
    }

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
    public double getLowOrbitAltitude() {
        return LOW_ORBIT_ALTITUDE_IN_KM;
    }

    @Override
    public double getDeltaVForLowOrbit() {
        return (DELTAV_FOR_LOW_ORBIT * SAFE_DELTAV_MODIFIER);
    }

    @Override
    public double getDeltaVForSOIEdge() {
        return (DELTAV_FOR_SOI_EDGE_ORBIT * SAFE_DELTAV_MODIFIER);
    }

    @Override
    public double getDeltaVForIntercept() {
        return (DELTAV_FOR_INTERCEPT * SAFE_DELTAV_MODIFIER);
    }

    @Override
    public boolean AerobrakingPossible() {
        return AEROBRAKING_POSSIBLE_FOR_PLANET;
    }
}
