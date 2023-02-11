/**
 * 
 */
package racerFiles;

import java.util.Random;

/**
 * @author a4432_asu
 *
 */
public class MagicRabbit extends Hare {

	private boolean daylight;
	/**
	 * @param name
	 */
	public MagicRabbit(String name) {
		super(name);
		daylight = true;
	}
	
	private void setDaylight() {daylight = !daylight;}

	@Override
	public void run(double timeInSeconds) {
		setDaylight();
		if(arrogant) {
			System.out.println(toString() + " is napping.");
		}
		else if(!daylight) {
			this.distanceCoveredInMeters += timeInSeconds*this.maxSpeedMetersPerSecond;
		}
		else {
			this.distanceCoveredInMeters += timeInSeconds*this.minSpeedMetersPerSecond;
		}
		
		
	}
	
	
}
