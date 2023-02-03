/**
 * 
 */
package racerFiles;

/**
 * @author a4432_asu
 *
 */
public class Racer {
	private String name = "";
	private double minSpeedMetersPerSecond, maxSpeedMetersPerSecond,
	distanceCoveredInMeters = 0.0;
	
	/**
	 * @return the distanceCoveredInMeters
	 */
	public double getDistanceCoveredInMeters() {
		return distanceCoveredInMeters;
	}
	
	public void run(double timeInSeconds) {
		System.out.println("IN run()");
	}
	


}
