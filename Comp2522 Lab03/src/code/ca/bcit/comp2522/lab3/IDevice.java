package ca.bcit.comp2522.lab3;

/**
 * <p>
 *   parent class that contains details that is shared among all subclasses
 *   including a method called purpose and an abstract method called print details
 *   of the child class's instance variable
 * </p>
 *
 * @author Farzad Farzin
 * @author Anil Bronson
 * @author Dalraj Bains
 * @version 1.0
 */
public abstract class IDevice {

  private final String purpose;

  public IDevice(final String purpose) {
    this.purpose = purpose;
  }

  /**
   * getter for the purpose and making it accessible for the child classes
   * @return purpose
   */
  public String getPurpose() {
    return purpose;
  }

  /**
   * print detail method which will be accessible to the child classes later
   */
  public abstract void printDetails();

  /**
   * equal method that get the equal phones, ipod and ipad
   */
  @Override
  public abstract boolean equals(final Object obj);

  /**
   * hashcode used for each class
   * @return hashcode
   */
  @Override
  public abstract int hashCode();
}
