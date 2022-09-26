/**
 This enum specifies five locations and associates a zip code and county name with them for use
 @author Sameer Ahmed
 */
public enum Location {

     //BRIDGEWATER represents city Bridgewater NJ, associating the zip code 08807 and county Somerset

    BRIDGEWATER ("08807", "Somerset"),

     //EDISON represents city Edison NJ, associating the zip code 08837 and county Middlesex

    EDISON ("08837", "Middlesex"),

     //FRANKLIN represents city Franklin NJ, associating the zip code 08873 and county Somerset

    FRANKLIN ("08873", "Somerset"),

     //PISCATAWAY represents city Piscataway NJ, associating the zip code 08854 and county Middlesex

    PISCATAWAY("08854", "Middlesex"),

     //SOMERVILLE represents city Somerville NJ, associating the zip code 08876 and county Somerset

    SOMERVILLE("08876", "Somerset");

    private final String countyName;
    private final String zipCode;

    /**
     This constructor creates a Location object with the zip code and county name associated with it
     @param zipCode the zip code for the city in the county
     @param countyName the name of the city in the county
     */
    Location (String zipCode, String countyName) {
        this.countyName = countyName;
        this.zipCode = zipCode;
    }

    /**
     This method compares two zip codes
     @param location a location to compare against
     @return 0 if the zip codes are the same, 1 if the numeric value of the argument zip code is greater,
     -1 if it is less than
     */
    public int compareZip(Location location) {
        return location.zipCode.compareTo(this.zipCode);
    }

    /**
     This method creates and returns a String representation of the Location, including the city name, zip code and
     county name
     @return a String object representing the location
     */
    public String toString() {
        return this.countyName + " " + this.zipCode + ", " + this.name();
    }
}
