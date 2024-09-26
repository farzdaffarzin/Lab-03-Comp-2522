package ca.bcit.comp2522.lab3;

/**
 * IPod class purpose is to play music. it can save songs and have a volume
 *
 * @author Farzad Farzin
 * @author Anil Bronson
 * @author Dalraj Bains
 * @version 1.0
 */
public class IPod extends IDevice {

  private final int numberofSongs;
  private final double maxVolumeDecibels;

  /**
   * Constructor to initialize the iPod with the number of songs and maximum volume.
   *
   * @param numberofSongs Number of songs the iPod can store
   * @param maximumVolumeDecibels Maximum volume of the iPod in decibels
   */
  public IPod(final int numberofSongs,
              final double maximumVolumeDecibels) {
    super("music");
    this.numberofSongs = numberofSongs;
    this.maxVolumeDecibels = maximumVolumeDecibels;
  }

  /**
   * Get the number of songs the iPod can store.
   *
   * @return Number of songs
   */
  public int getNumberofSongs() {
    return numberofSongs;
  }

  /**
   * Get the maximum volume of the iPod in decibels.
   *
   * @return Maximum volume in decibels
   */
  public double getMaxVolumeDecibels() {
    return maxVolumeDecibels;
  }


  /**
   * Return a string representation of the iPod.
   *
   * @return String representation of the iPod
   */
  @Override
  public String toString() {
    return super.toString() + ", Number of Songs: "
            + numberofSongs + ", Max Volume: " + maxVolumeDecibels + " dB";
  }

  /**
   * Print the details of the iPod.
   */
  @Override
  public void printDetails() {
    System.out.println(this);
  }

  /**
   * Check if this iPod is equal to another object.
   *
   * @param obj The object to compare with
   * @return true if the objects are equal, false otherwise
   */
  @Override
  public boolean equals(final Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof IPod)) return false;
    IPod other = (IPod) obj;
    return numberofSongs == other.numberofSongs;
  }

  /**
   * Generate a hash code for the iPod.
   *
   * @return Hash code
   */
  @Override
  public int hashCode() {
    return Integer.hashCode(numberofSongs);
  }
}
