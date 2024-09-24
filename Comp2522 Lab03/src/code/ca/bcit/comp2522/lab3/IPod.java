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
  private int numberofSongs;
  private double maxVolumeDecibels;

  public IPod(final int numberofSongs,
              final double maximumVolumeDecibels) {
    super("music");
    this.numberofSongs = numberofSongs;
    this.maxVolumeDecibels = maximumVolumeDecibels;
  }

  public int getNumberofSongs() {
    return numberofSongs;
  }

  public double getMaxVolumeDecibels() {
    return maxVolumeDecibels;
  }


  @Override
  public String toString() {
    return super.toString() + ", Number of Songs: "
            + numberofSongs + ", Max Volume: " + maxVolumeDecibels + " dB";
  }

  @Override
  public void printDetails() {
    System.out.println(this);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof IPod)) return false;
    IPod other = (IPod) obj;
    return numberofSongs == other.numberofSongs;
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(numberofSongs);
  }
}
