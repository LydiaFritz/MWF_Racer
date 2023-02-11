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
		return "PRIVATE VARIABLE";
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
			
			System.out.println(getName() + " seems to be excited! He's flying..");			
		} else {
			//keep the speed if not inspired
			double speed = diff + this.minSpeedMetersPerSecond;
			this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
			
			System.out.println(getName() +" is not in a good day.");
		}
	}
}
    