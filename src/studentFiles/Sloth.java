package studentFiles;

import racerFiles.Racer;

public class Sloth extends Racer {

	private boolean isAsleep;

	public Sloth(String name) {
		super(name, 2, 3);
		isAsleep = false;
	}

	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}

	public boolean isAsleep() {
		return isAsleep;
	}

	public void run(double timeInSeconds) {
		double speed = 1.5;
		if (!isAsleep) {
			distanceCoveredInMeters += speed * timeInSeconds;
		} else
			distanceCoveredInMeters = 0;
	}
}