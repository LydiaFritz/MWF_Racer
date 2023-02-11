package studentFiles;

import racerFiles.Racer;

//class must be PUBLIC!
public class MarioKartChar extends Racer {
	public String kartName;
	public boolean hasMushroom;

	public MarioKartChar(String name, double minSpeed, double maxSpeed, String kartName) {
		super(name, minSpeed, maxSpeed);
		this.kartName = kartName;
	}

	public void itemBox() {
		if (Math.floor(Math.random() * 10) >= 4) {
			this.hasMushroom = true;
			System.out.println("Got mushroom");
		}
	}

	public void run() {
		double currSpeed = Math.floor(Math.random() * (this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond + 1)
				+ this.minSpeedMetersPerSecond);

		if (this.hasMushroom)
			currSpeed *= 2;

		this.distanceCoveredInMeters += currSpeed;

		System.out.printf("%s traveled %.0f meters on the %s. Now is %.0f meters along the track.", getName(),
				currSpeed, this.kartName, this.distanceCoveredInMeters);
		this.printRunStatement(currSpeed);
	}

	@Override
	public void run(double timeInSeconds) {
		// YOU ARE REQUIRED TO OVERRIDE THIS.
		// YOU CAN STILL CALL YOUR VERSION OF RUN()
		run();

	}
	 //ADDED by L FRITZ so output shows how far each racer travels in each interval
  	private void printRunStatement(double distance) {
  		System.out.printf("%s the MK player advances %.1f meters for a total of %.1f meters.\n", getName(), distance,
  				this.distanceCoveredInMeters);
  	}
}
