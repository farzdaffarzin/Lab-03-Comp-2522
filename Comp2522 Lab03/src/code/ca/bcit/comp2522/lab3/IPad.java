package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * The IPad class represents a type of IDevice with additional properties
 * such as whether it has a case and the operating system it runs.
 *
 * @author Farzad Farzin
 * @author Anil Bronson
 * @author Dalraj Bains
 * @version 1.0
 */
public class IPad extends IDevice {

    // A boolean to indicate if the iPad has a case.
    private final boolean hasCase;

    // The operating system that the iPad runs.
    private final String OperatingSystem;

    /**
     * Constructor for the IPad class.
     * Initializes the iPad with a specified case status and operating system.
     *
     * @param hasCase boolean indicating if the iPad has a case
     * @param OperatingSystem the operating system of the iPad
     */
    public IPad(final boolean hasCase,final String OperatingSystem) {
        super("learning");  // Calls the superclass constructor with "learning" as the purpose
        this.hasCase = hasCase;
        this.OperatingSystem = OperatingSystem;
    }

    /**
     * Prints the details of the iPad, including whether it has a case and
     * the operating system it's running.
     */
    @Override
    public void printDetails() {
        final String format;
        // Checks if the iPad has a case and prints the appropriate message
        if (hasCase) {
            format = String.format("The iPad has a case and is running %s", OperatingSystem);
        } else {
            format = String.format("The iPad does not have a case and is running %s", OperatingSystem);
        }
        System.out.println(format);
    }

    /**
     * Checks if this iPad is equal to another object.
     * Two iPads are considered equal if their operating systems are the same,
     * ignoring case sensitivity.
     *
     * @param obj the object to compare against
     * @return true if the operating systems match, false otherwise
     */
    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        // Checks if the other object is of the same class (IPad)
        if (obj.getClass().equals(this.getClass())) {
            // Compares the operating systems, ignoring case
            return ((IPad) obj).OperatingSystem.equalsIgnoreCase(this.OperatingSystem);
        }
        return false;
    }

    /**
     * Generates a hash code based on the operating system of the iPad.
     *
     * @return the hash code of the operating system
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(OperatingSystem);
    }
}
