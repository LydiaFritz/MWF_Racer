/**
 * 
 */
package racerFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Tortoise extends Racer {

	/**
	 * @param name
	 * @param minSpeed
	 * @param maxSpeed
	 */
	public Tortoise(String name) {
		super(name, 2, 3);
		//System.out.println("Tortoise constructor");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tortoise []";
	}

	@Override
	public void run(double timeInSeconds) {
		{
			System.out.println("Tortoise is walking");
			Random r = new Random();
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;
			
			distanceCoveredInMeters += speed*timeInSeconds;
		}

		
	}

}
