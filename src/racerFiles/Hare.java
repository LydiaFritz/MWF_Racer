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
	private boolean arrogant;

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
		setArrogant();
		//System.out.println("Hare constructor");
	}

	private void setArrogant() {
		if (r.nextDouble() <= .6)
			this.arrogant = true;
		else
			this.arrogant = false;
	}

	@Override
	public void run(double timeInSeconds) {
		{
			setArrogant();
			if (arrogant) {
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
