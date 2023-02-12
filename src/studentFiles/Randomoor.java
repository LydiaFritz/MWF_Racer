package studentFiles;

/**
 * 
 */


import java.util.Random;

import racerFiles.Racer;

/**
 * @author a4432_asu
 *
 */
public class Randomoor extends Racer {

	/**
	 * @param name
	 * @param minSpeed
	 * @param maxSpeed
	 */
	public Randomoor(String name) {
		super(name, -4.0, 4.0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void run(double timeInSeconds) {
		{
			System.out.println("Randomoor is walking");
			Random r = new Random();
			double rate = r.nextDouble();
            System.out.println("Rate" + rate);
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;
			
			distanceCoveredInMeters += speed*timeInSeconds;
            //System.out.println("Randomoor covered: " + distanceCoveredInMeters);
			this.printRunStatement(speed*timeInSeconds);
		}

		
	}

}
    