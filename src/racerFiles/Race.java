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
		update();
		while(getWinner()==null) {
			update();
		}
	}
	
	private void update() {
		for(int i = 0; i < racers.size(); i++) {
			racers.get(i).run(timeSeconds);
		}
	}
	
	public Racer getWinner() {
		Racer winner = null;
		for(Racer r : racers) {
			if(r.getDistanceCoveredInMeters()>=this.distanceMeters)
				winner = r;
		}
		return winner;
	}
	

}
