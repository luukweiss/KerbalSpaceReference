package nl.weiss.kerbalspacereferenceguide.datamodel;

public interface PlanetInterface {

    /** Get the name of the planet*/
    String getName();

    /** Get the altitude where the atmosphere starts in km */
    int getAtmosphereInKm();

    /** Get the altitude where the atmosphere starts in km*/
    int getAtmosphereInMeters();

    /** The semi-synchronous orbit that has a orbital period of 0.5 of planets rotation period */
    String getSemiSynchronousObritPeriod();

    /** The orbital velocity for the semi-synchronous orbit, in meters per second [m/s] */
    double getOrbitalVelocity();

    /** Altitude of the geostationary orbit in km*/
    double getGeostationaryOrbitAltitude();

    double getLowOrbitAltitude();

    double getDeltaVForLowOrbit();

    double getDeltaVForSOIEdge();

    double getDeltaVForIntercept();

    boolean AerobrakingPossible();

}
