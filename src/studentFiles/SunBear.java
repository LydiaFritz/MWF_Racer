package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class SunBear extends Racer {

	private static Random r = new Random();

	public String toString() {
		return "Sun Bear []";
	}

	public SunBear(String name) {

		super(name, 5, 20);

	}

	private boolean isAggressive() {

		if (r.nextDouble() <= .4)
			return true;
		else
			return false;

	}

	public void run(double timeInSeconds) {

		if (isAggressive()) {
			System.out.println("Sun Bear is brawling.");
			printRunStatement(0);
		} else {
			System.out.println("Sun Bear is peacefully running.");
			Random r = new Random();
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;

			distanceCoveredInMeters += speed * timeInSeconds;
			printRunStatement(speed*timeInSeconds);
		}

	}

}
