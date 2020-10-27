package com.example.android.quakereport;

public class Earthquake {

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Locations of the earthquake */
    private String mLocation;

    /** Date of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /**
     * @param magnitude is the magnitude of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * @return the magnitude of the earthquake
     */
    public double getMagnitude() { return mMagnitude; }

    /**
     * @return the location of the earthquake
     */
    public String getLocation() { return mLocation; }

    /**
     * @return the date of the earthquake
     */
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() { return mUrl; }

}
