package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class RoadRunnerBeepBeep extends Racer {

	private static Random r = new Random();

	@Override
	public String toString() {
		return "RoadRunnerBeepBeep []";
	}

	/**
	 * @param name
	 * @param minSpeed
	 * @param maxSpeed
	 */
	public RoadRunnerBeepBeep(String name) {
		super(name, 2, 20);
	}

	private boolean speedBoost() {
		if (r.nextDouble() >= .75)
			return true;
		else
			return false;
	}

	@Override
	public void run(double timeInSeconds) {
		double distance = 0.0;
		if (speedBoost()) {
			System.out.println("RoadRunnerBeepBeep is running!");
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;
			distanceCoveredInMeters += speed * timeInSeconds;
			distance = speed * timeInSeconds;
		} else {
			System.out.println("RoadRunnerBeepBeep is eating.");
		}
		//Random r = new Random();
		this.printRunStatement(distance);
		
		
	}
}
