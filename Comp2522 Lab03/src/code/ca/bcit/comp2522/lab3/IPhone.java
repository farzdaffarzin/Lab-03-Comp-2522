package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPhone device.
 *
 * @author Dalraj Bains
 * @author Anil Bronson
 * @author Farzad Farzin
 * @version 1.0
 */
public class IPhone extends IDevice {

  private double minutesRemaining;
  private String carrier;

  /**
   * Constructs an IPhone with specified minutes remaining and carrier.
   *
   * @param minutesRemaining the number of minutes remaining on the phone plan
   * @param carrier the carrier of the phone
   */
  public IPhone(double minutesRemaining,
                String carrier) {

    // Set the purpose of the device to "talking"
    super("talking");
    this.minutesRemaining = minutesRemaining;
    this.carrier = carrier;
  }

  /**
   * Gets the minutes remaining on the phone plan.
   *
   * @return the minutes remaining
   */
  public double getMinutesRemaining() {
    return minutesRemaining;
  }

  /**
   * Sets the minutes remaining on the phone plan.
   *
   * @param minutesRemaining the new minutes remaining
   */
  public void setMinutesRemaining(double minutesRemaining) {
    this.minutesRemaining = minutesRemaining;
  }

  /**
   * Gets the carrier of the phone.
   *
   * @return the carrier
   */
  public String getCarrier() {
    return carrier;
  }

  /**
   * Sets the carrier of the phone.
   *
   * @param carrier the new carrier
   */
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  /**
   * Prints the details of the iPhone, including minutes remaining and carrier.
   */
  @Override
  public void printDetails() {

    System.out.println("Minutes Remaining: " +
            minutesRemaining);

    System.out.println("Carrier: " +
            carrier);
  }

  /**
   * Returns a string representation of the iPhone, including all instance variables.
   *
   * @return a string with all instance variables
   */
  @Override
  public String toString() {
    return super.toString() +
            ", Minutes Remaining: " +
            minutesRemaining +
            ", Carrier: " +
            carrier;
  }

  /**
   * Checks if this iPhone is equal to another object based on minutes remaining.
   *
   * @param obj the object to compare with
   * @return true if the objects are equal, false otherwise
   */
  @Override
  public boolean equals(Object obj) {

    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    IPhone iPhone = (IPhone) obj;
    return Double.compare(iPhone.minutesRemaining, minutesRemaining) == 0;
  }

  /**
   * Returns the hash code of the iPhone based on minutes remaining.
   *
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(minutesRemaining);
  }
}
