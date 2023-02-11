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
		Racer racer = new Mario("Mario");
		r.signUpRacer(racer);
		racer = new Tortoise("Amy");
		r.signUpRacer(racer);
		racer = new Airplane();
		r.signUpRacer(racer);
		racer = new Hare("Mr. Bunbun");
		r.signUpRacer(racer);
		racer = new NascarRacer("Billy Joe Wilkins");
		r.signUpRacer(racer);
		racer = new RoadRunnerBeepBeep("RR");
		r.signUpRacer(racer);
		racer = new Randomoor("Randy the Rando");
		r.signUpRacer(racer);
		racer = new MarioKartChar("WARIO", 10, 100, "Dune Buggy");
		r.signUpRacer(racer);
		racer = new Yoshi("YOSHI");
		r.signUpRacer(racer);
		racer = new F1driver("Buddy the Elf", 1, 2);
		r.signUpRacer(racer);
		racer = new Dragon("Jerry");
		r.signUpRacer(racer);
		racer = new SunBear("Griz");
		r.signUpRacer(racer);
		racer = new DonkeyKong("DK");
		r.signUpRacer(racer);
		racer = new Eagle("Goldberg and Osborne");
		r.signUpRacer(racer);
		racer = new Frog("Olivia", 1, 4);
		r.signUpRacer(racer);
		racer = new Sloth("Snuggles");
		racer = new MagicRabbit("Trixie");
		
	}
}