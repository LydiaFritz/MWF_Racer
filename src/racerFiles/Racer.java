/**
 * 
 */
package racerFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class Racer {
	private String name = "";
	private double minSpeedMetersPerSecond, maxSpeedMetersPerSecond,
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
	
	public void run(double timeInSeconds) {
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
		diff *= rate;
		double speed = this.minSpeedMetersPerSecond + diff;
		
		distanceCoveredInMeters += speed*timeInSeconds;
	}

	@Override
	public String toString() {
		return name;
	}
	
	


}
