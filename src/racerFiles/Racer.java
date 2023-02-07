/**
 * 
 */
package racerFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public abstract class Racer {
	private String name = "";
	protected double minSpeedMetersPerSecond, maxSpeedMetersPerSecond,
	distanceCoveredInMeters = 0.0;
	
	public Racer(String name, double minSpeed, double maxSpeed) {
		this.name = name;
		this.maxSpeedMetersPerSecond = maxSpeed;
		this.minSpeedMetersPerSecond = minSpeed;
	}
	
	/**
	 * @return the distanceCoveredInMeters
	 */
	public double getDistanceCoveredInMeters() {
		return distanceCoveredInMeters;
	}
	
	public abstract void run(double timeInSeconds);
	
	@Override
	public String toString() {
		return name;
	}
	
	


}
