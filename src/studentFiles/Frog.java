package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class Frog extends Racer{
	
	public Frog(String name, double minSpeed, double maxSpeed) {
		super(name, minSpeed, maxSpeed);
		// TODO Auto-generated constructor stub
		
	}
	
	public String toString() {
		return "Frog []";
	}
	
	public void run(double timeInSeconds) {
		System.out.println("Frog is hopping");
		Random r = new Random();
		double rate = r.nextDouble();
		double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
		diff *= rate;
		double speed = this.minSpeedMetersPerSecond + diff;
		
		distanceCoveredInMeters += speed*timeInSeconds;
	}
	
	}
