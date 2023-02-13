/**
 * 
 */
package racerFiles;

import studentFiles.Airplane;
import studentFiles.DonkeyKong;
import studentFiles.Dragon;
import studentFiles.Eagle;
import studentFiles.F1driver;
import studentFiles.Frog;
import studentFiles.Mario;
import studentFiles.NascarRacer;
import studentFiles.Randomoor;
import studentFiles.RoadRunnerBeepBeep;
import studentFiles.Sloth;
import studentFiles.SunBear;
import studentFiles.Yoshi;
import studentFiles.MarioKartChar;

/**
 * @author a4432_asu
 *
 */
public class Driver {

	private static final double TIME_IN_SECONDS = 5.0;
	private static final double RACE_DISTANCE_METERS = 200.0;

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {

		Race theRace = new Race(RACE_DISTANCE_METERS, TIME_IN_SECONDS);
		signUpRacers(theRace);
		theRace.start();
		announceWinner(theRace);

	}

	private static void announceWinner(Race r) {
		System.out.print("The Race is over!\n\t");
		System.out.println(r.getWinner() + " is the winner.");
	}

	private static void signUpRacers(Race r) {
		Racer racer = new Mario("Mario");
		r.signUpRacer(racer);
		racer = new Tortoise("Shelly");
		r.signUpRacer(racer);
		racer = new Airplane();
		r.signUpRacer(racer);
		racer = new Hare("Cottontail");
		r.signUpRacer(racer);
		racer = new NascarRacer("BillyMack");
		r.signUpRacer(racer);
		racer = new RoadRunnerBeepBeep("RR");
		r.signUpRacer(racer);
		racer = new Randomoor("RandyRando");
		r.signUpRacer(racer);
		racer = new MarioKartChar("Wario", 10, 100, "Dune Buggy");
		r.signUpRacer(racer);
		racer = new Yoshi("Bella");
		r.signUpRacer(racer);
		racer = new F1driver("Andre", 1, 2);
		//r.signUpRacer(racer);
		racer = new Dragon("Sparky");
		r.signUpRacer(racer);
		racer = new SunBear("Grizzle");
		r.signUpRacer(racer);
		racer = new DonkeyKong("D.K.");
		r.signUpRacer(racer);
		racer = new Eagle("Artemis");
		r.signUpRacer(racer);
		racer = new Frog("Princess", 1, 4);
		r.signUpRacer(racer);
		racer = new Sloth("Snuggles");
		r.signUpRacer(racer);
		racer = new MagicRabbit("Trixie");
		r.signUpRacer(racer);
		
	}
}