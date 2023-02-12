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
		printRunStatement(speed*timeInSeconds);
	}
	//MOVED TO RACER
	/*
	 * //ADDED by L FRITZ so output shows how far each racer travels in each
	 * interval private void printRunStatement(double distance) { System.out.
	 * printf("%s the F1 driver advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */
	
	}
