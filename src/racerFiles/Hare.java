/**
 * 
 */
package racerFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Hare extends Racer {

	private static Random r = new Random();

	@Override
	public String toString() {
		return "Hare []";
	}

	/**
	 * @param name
	 * @param minSpeed
	 * @param maxSpeed
	 */
	public Hare(String name) {
		super(name, 10, 15);
		// TODO Auto-generated constructor stub
	}

	private boolean isArrogant() {
		if (r.nextDouble() <= .6)
			return true;
		else
			return false;
	}

	@Override
	public void run(double timeInSeconds) {
		{
			if (isArrogant()) {
				System.out.println("The arrogant hare is napping.");
			} else {
				System.out.println("Hare is hopping");
				Random r = new Random();
				double rate = r.nextDouble();
				double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
				diff *= rate;
				double speed = this.minSpeedMetersPerSecond + diff;

				distanceCoveredInMeters += speed * timeInSeconds;
			}
		}

	}

}
