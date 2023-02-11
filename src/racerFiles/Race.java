package racerFiles;

import java.util.ArrayList;
import java.util.Collections;

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
	
	private void announceRacers() {
		//shuffle the field
		Collections.shuffle(racers);
	}
	
	public void start() {
		//shuffle and announce the racers
		this.announceRacers();
		update();
		while(getWinner()==null) {
			update();
		}
	}
	
	private void update() {
		for(int i = 0; i < racers.size(); i++) {
			racers.get(i).run(timeSeconds);
			System.out.println();
			//slow it down
			try {
				Thread.sleep(1200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
