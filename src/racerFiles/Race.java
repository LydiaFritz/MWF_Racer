package racerFiles;

import java.util.ArrayList;
import java.util.Collections;

public class Race {
	private ArrayList<Racer> racers;
	private double distanceMeters, timeSeconds;
	
	public static int currentInterval = 0;
	
	public Race(double distance, double time) {
		racers = new ArrayList<Racer>();
		this.distanceMeters = distance;
		this.timeSeconds = time;
	}
	
	public void signUpRacer(Racer r) {
		racers.add(r);
	}
	
	private void announceRacers() throws InterruptedException {
		//shuffle the field
		Collections.shuffle(racers);
		System.out.printf("Today's racers are...\n");
		Thread.sleep(2000);
		for(Racer r : racers) {
			System.out.printf("\n\t%s the %s\n", r.getName(), 
					r.getObjectType());
			Thread.sleep(1200);
		}
		
	}
	
	//UPDATED BY FRITZ to show current interval
	public void start() throws InterruptedException {
		//shuffle and announce the racers
		this.announceRacers();
		currentInterval++;
		System.out.printf("\nInterval %d beginning...\n\n", currentInterval);
		update();
		while(getWinner()==null) {
			currentInterval++;
			System.out.printf("\n\nInterval %d beginning...\n", currentInterval);
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
