/**
 * 
 */
package racerFiles;

/**
 * @author a4432_asu
 *
 */
public class Driver {

	private static final double TIME_IN_SECONDS = 5.0;
	private static final double RACE_DISTANCE_METERS = 200.0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Race theRace = new Race(RACE_DISTANCE_METERS, TIME_IN_SECONDS);
		signUpRacers(theRace);
		theRace.start();
		announceWinner(theRace);

	}

	private static void announceWinner(Race r) {
		System.out.println(r.getWinner() + " is the winner.");
	}

	private static void signUpRacers(Race r) {
		Racer racer = new Hare("Bob");
		r.signUpRacer(racer);
		racer = new Tortoise("Amy");
		r.signUpRacer(racer);
		racer = new Tortoise("Cal");
		r.signUpRacer(racer);
	}
}