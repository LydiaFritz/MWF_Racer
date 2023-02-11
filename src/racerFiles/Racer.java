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
		//System.out.println("Racer constructor");
	}
	

	public String getName() {return name;}
	
	/**
	 * @return the distanceCoveredInMeters
	 */
	public double getDistanceCoveredInMeters() {
		return distanceCoveredInMeters;
	}
	
	public abstract void run(double timeInSeconds);
	
	public String getObjectType() {
		String canonicalName =  this.getClass().getCanonicalName();
		return canonicalName.substring(canonicalName.indexOf(".")+1);
	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
	


}
