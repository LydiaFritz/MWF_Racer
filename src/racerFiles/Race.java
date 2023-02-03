package racerFiles;

import java.util.ArrayList;

public class Race {
	private ArrayList<Racer> racers;
	private double distanceMeters, timeSeconds;
	
	public Race(double distance, double time) {
		racers = new ArrayList<Racer>();
		this.distanceMeters = distance;
		this.timeSeconds = time;
	}
	
	public void signUpRacer(Racer r) {
		racers.add(r);
	}
	
	public void start() {
		System.out.println("Starting the race");
	}
	
	private void update() {
		System.out.println("Updating racers");
	}
	
	public Racer getWinner() {
		return null;
	}
	

}
