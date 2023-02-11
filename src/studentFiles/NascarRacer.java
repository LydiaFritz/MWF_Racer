package studentFiles;

import java.util.Random;

import racerFiles.Racer;

//Syntax updated by Ms. Fritz
public class NascarRacer extends Racer {
	public NascarRacer(String name) {
		super(name, 2.0, 3.0);
		double invincibility = 4.0;
	}

	@Override
	public String toString() {
		return "nascarRacer";
	}

	public void run(double timeIntervalSeconds) {
		System.out.println("Nascar racer is racing...");
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
		diff *= rate;
		double speed = diff + this.maxSpeedMetersPerSecond;
		this.distanceCoveredInMeters += (speed * timeIntervalSeconds);
	}
}