package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class DonkeyKong extends /* racer(){ */ Racer {

	private static Random r = new Random();
	boolean dropped = false;

	public DonkeyKong(String name) {
		super(name, 15, 25);
	}

	public String toString() {
		return getName();
	}

	// cannot be static
	public /* static */ void peel() {
		if (r.nextDouble() >= 1) {
			dropped = true;
		}
	}

	public void run(double timeInSeconds) {
		System.out.println("Donkey Kong is running");
		double rate = r.nextDouble();
		double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
		diff *= rate;
		double speed = this.minSpeedMetersPerSecond + diff;

		distanceCoveredInMeters += speed * timeInSeconds;
		this.printRunStatement(speed * timeInSeconds);
	}

//REMOVED BY L FRITZ AND ADDED TO RACER	
//ADDED by L FRITZ so output shows how far each racer travels in each interval
	/*
	 * private void printRunStatement(double distance) { System.out.
	 * printf("%s Donkey Kong advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */
}