package studentFiles;

import java.util.Random;

import racerFiles.Racer;

public class Dragon extends Racer{
    
    private static Random random = new Random();

    @Override
    public String toString() {
        return "Dragon";
    }

    public Dragon(String name) {
        super(name, 6, 12);
    }

    private boolean isFlying() {
        if (random.nextDouble() <= .25) return true;
        else return false;
    }

    @Override
    public void run(double timeInSeconds) {

        Random r = new Random();
        double rate = r.nextDouble();

        if (isFlying()) {
            System.out.println("The Dragon is flying");
            double diff = this.maxSpeedMetersPerSecond - (2 * this.minSpeedMetersPerSecond);
            diff *= rate;
            double speed = (2 * this.minSpeedMetersPerSecond + diff);
        
            distanceCoveredInMeters += speed * timeInSeconds;
            printRunStatement(speed*timeInSeconds);
        }
        else {
            System.out.println("The Dragon is walking");
            double diff = this.maxSpeedMetersPerSecond - this.minSpeedMetersPerSecond;
            diff *= rate;
            double speed = this.minSpeedMetersPerSecond + diff;
        
            distanceCoveredInMeters += speed * timeInSeconds;
            printRunStatement(speed*timeInSeconds);
        }
    }
//MOVED TO RACER CLASS    
  //ADDED by L FRITZ so output shows how far each racer travels in each interval
	/*
	 * private void printRunStatement(double distance) { System.out.
	 * printf("%s the Dragon advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */
    
    
}

