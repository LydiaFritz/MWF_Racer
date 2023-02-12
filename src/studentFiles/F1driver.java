package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class F1driver extends Racer{
	
	private static final Random rnd = new Random();
	private boolean isInspired;

	
	public F1driver(String name, double minSpeedInMetersPerSecond, double maxSpeedInMetersPerSecon) {
		//no need for parameters if you are setting these values to constants.
		super(name, 16, 60);
	}
	
	private boolean setInspired() {
		// 60% of the time the driver is inspired
		isInspired = rnd.nextDouble() <= .6;
		return isInspired;

	}
	
	public String getName() {
		return super.getName();
	}
	
	public void run(double timeIntervalSeconds) {
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
		diff *= rate;

		
		if (setInspired()) {	
			//boost speed by 12 if inspired
			double speed = diff + this.minSpeedMetersPerSecond + 12;
			this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
			printRunStatement(speed * timeIntervalSeconds);
			System.out.println(getName() + " seems to be excited! He's flying..");			
		} else {
			//keep the speed if not inspired
			double speed = diff + this.minSpeedMetersPerSecond;
			this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
			printRunStatement(speed * timeIntervalSeconds);
			
			System.out.println(getName() +" is not in a good day.");
		}
		
	}
	//MOVED TO RACER
	/*
	 * //ADDED by L FRITZ so output shows how far each racer travels in each
	 * interval private void printRunStatement(double distance) { System.out.
	 * printf("%s the F1 driver advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */

}
    