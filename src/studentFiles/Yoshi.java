package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class Yoshi extends Racer {
	private static Random r = new Random();
	private double leapChance = 0.0;

	public Yoshi(String name) {
		super(name, 5, 12);
	}

	@Override
	public String toString() {
		return "Yoshi";
	}

	@Override
	public void run(double timeInSeconds) {
		{
			leapChance += 10.0;
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			if (leapChance >= r.nextInt()/*nextDouble(0, 100)*/) {
				System.out.println("Yoshi is leaping.");
				leapChance = 0.0;
				diff *= (rate * 5);
				double speed = this.minSpeedMetersPerSecond + diff;
				distanceCoveredInMeters += speed * timeInSeconds;
			} else {
				System.out.println("Yoshi is running.");
				diff *= rate;
				double speed = this.minSpeedMetersPerSecond + diff;
				distanceCoveredInMeters += speed * timeInSeconds;
			}
		}
	}
}