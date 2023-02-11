package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class Mario extends Racer {

	private static Random r = new Random();

	public String toString() {
		return "Mario []";
	}

	public Mario(String name) {
		super(name, 4, 13);
	}

	private boolean pickUp() {
		if (r.nextDouble() <= .3)
			return true;
		else
			return false;
	}

	public void run(double timeInSeconds) {
		{
			Random r = new Random();
			double rate = r.nextDouble();
			double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
			diff *= rate;
			double speed = this.minSpeedMetersPerSecond + diff;
			if (pickUp()) {
					System.out.println("MARIO!!");
					distanceCoveredInMeters += (this.maxSpeedMetersPerSecond + 3) * timeInSeconds;
			}
			else distanceCoveredInMeters += speed * timeInSeconds;
		}

	}

}
