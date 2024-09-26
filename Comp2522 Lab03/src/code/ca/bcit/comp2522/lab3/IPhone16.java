package ca.bcit.comp2522.lab3;

import java.util.Objects;

/**
 * Represents an iPhone 16 device which is extending the IPhone class.
 *
 * @author Dalraj Bains
 * @author Anil Bronson
 * @author Farzad Farzin
 * @version 1.0
 */
public class IPhone16 extends IPhone {

  private boolean highResolutionCamera;
  private int gigabytesOfMemory;

  /**
   * Constructs an IPhone16 with specified attributes.
   *
   * @param minutesRemaining the number of minutes remaining on the phone plan
   * @param carrier the carrier of the phone
   * @param highResolutionCamera whether the phone has a high-resolution camera
   * @param gigabytesOfMemory the amount of memory in gigabytes
   */
  public IPhone16(double minutesRemaining,
                  final String carrier,
                  final boolean highResolutionCamera,
                  int gigabytesOfMemory) {

    // Call the parent constructor
    super(minutesRemaining, carrier);
    this.highResolutionCamera = highResolutionCamera;
    this.gigabytesOfMemory = gigabytesOfMemory;
  }

  /**
   * Checks if the phone has a high-resolution camera.
   *
   * @return true if the phone has a high-resolution camera, false otherwise
   */
  public boolean hasHighResolutionCamera() {
    return highResolutionCamera;
  }

  /**
   * Sets the high-resolution camera status.
   *
   * @param highResolutionCamera the new camera status
   */
  public void setHighResolutionCamera(boolean highResolutionCamera) {
    this.highResolutionCamera = highResolutionCamera;
  }

  /**
   * Gets the amount of memory in gigabytes.
   *
   * @return the memory in gigabytes
   */
  public int getGigabytesOfMemory() {
    return gigabytesOfMemory;
  }

  /**
   * Sets the amount of memory in gigabytes.
   *
   * @param gigabytesOfMemory the new memory amount
   */
  public void setGigabytesOfMemory(int gigabytesOfMemory) {
    this.gigabytesOfMemory = gigabytesOfMemory;
  }

  /**
   * Prints the details of the iPhone 16, including high-resolution camera and memory.
   */
  @Override
  public void printDetails() {

    // Print details from the parent class
    super.printDetails();

    System.out.println("High Resolution Camera: " +
            highResolutionCamera);

    System.out.println("Gigabytes of Memory: " +
            gigabytesOfMemory);
  }

  /**
   * Returns a string representation of the iPhone 16, including all instance variables.
   *
   * @return a string with all instance variables
   */
  @Override
  public String toString() {
    return super.toString() +
            ", High Resolution Camera: " +
            highResolutionCamera +
            ", Gigabytes of Memory: " +
            gigabytesOfMemory;
  }

  /**
   * Checks if this iPhone 16 is equal to another object based on minutes remaining and high-resolution camera.
   *
   * @param obj the object to compare with
   * @return true if the objects are equal, false otherwise
   */
  @Override
  public boolean equals(final Object obj) {

    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    if (!super.equals(obj)) return false;
    IPhone16 iPhone16 = (IPhone16) obj;
    return highResolutionCamera == iPhone16.highResolutionCamera;
  }

  /**
   * Returns the hash code of the iPhone 16 based on minutes remaining and high-resolution camera.
   *
   * @return the hash code
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), highResolutionCamera);
  }
}
