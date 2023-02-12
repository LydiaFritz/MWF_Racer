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
	
	//NOTE FROM THE PROFESSOR:
	//I REALIZED, AFTER ADDING THE SAME CODE TO ALL OF THE SUBCLASSES,
	//THAT A BETTER DESIGN WOULD INCLUDE THE CODE IN THE RACER CLASS WHERE
	//EACH SUBCLASS WOULD INCLUDE IT BY INHERITANCE (which is exactly 
	//the point of inheritance).
	public void printRunStatement(double distance) {
		  System.out.printf("%s the %s advances %.1f meters for a total of %.1f meters.\n", 
				  getName(), getObjectType(), distance, this.distanceCoveredInMeters);
	  }
	
	public String getObjectType() {
		String canonicalName =  this.getClass().getCanonicalName();
		return canonicalName.substring(canonicalName.indexOf(".")+1);
	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
	


}
