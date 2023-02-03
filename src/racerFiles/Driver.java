package racerFiles;

public class Driver {
	
	public static void main(String[] args) {
		Race daRace = new Race(800.0, 10.0);
		Racer you = new Racer();
		daRace.signUpRacer(you);
	}
}
