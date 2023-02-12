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
	// updated access to protected for subclass
	protected boolean arrogant;

	@Override
	public String toString() {
		return getName();
	}

	/**
	 * @param name
	 * @param minSpeed
	 * @param maxSpeed
	 */
	public Hare(String name) {
		super(name, 10, 15);
		setArrogant();
		// System.out.println("Hare constructor");
	}

	private void setArrogant() {
		if (r.nextDouble() <= .6)
			this.arrogant = true;
		else
			this.arrogant = false;
	}

	@Override
	public void run(double timeInSeconds) {
		double distance = 0.0;
		setArrogant();
		if (arrogant) {
			System.out.printf("%s is being arrogant and is napping.", getName());
		} else {
			System.out.printf("%s the hare is hopping.\n", getName());
			Random r = new Random();
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;
			distance = speed * timeInSeconds;
			distanceCoveredInMeters += distance;
			
		}
		
		//WE HAVE TO CALL THIS STATEMENT EITHER WAY, SO IT SHOULD
		//GO OUTSIDE THE IF-ELSE
		this.printRunStatement(distance);

	}

}
