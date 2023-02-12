package studentFiles;

import java.util.Random;

import racerFiles.Racer;

/**
 * @author a4432_asu
 *
 */
public class Eagle extends Racer {

  private static Random r = new Random();

  @Override
  public String toString() {
    return "Eagle []";
  }

  /**
   * @param name
   * @param minSpeed
   * @param maxSpeed
   */
  public Eagle(String name) {
    super(name, 10, 15);
    // TODO Auto-generated constructor stub
  }

  private boolean isFlying() {
    if (r.nextDouble() <= .8)
      return true;
    else
      return false;
  }

  @Override
  public void run(double timeInSeconds) {
    
      if (isFlying()) {
        System.out.println("The Eagle is flying.");
      } else {
        System.out.println("Eagle is running");
        Random r = new Random();
        double rate = r.nextDouble();
        double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
        diff *= rate;
        double speed = this.minSpeedMetersPerSecond - diff;

        distanceCoveredInMeters += speed * timeInSeconds;
        printRunStatement(speed*timeInSeconds);
      }
    }
  
  //MOVED TO RACER CLASS
	/*
	 * //ADDED by L FRITZ so output shows how far each racer travels in each
	 * interval private void printRunStatement(double distance) { System.out.
	 * printf("%s Donkey Kong advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */
  }


    