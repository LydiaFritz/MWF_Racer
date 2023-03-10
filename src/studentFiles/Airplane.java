package studentFiles;

import java.util.Random;

import racerFiles.Hare;

public class Airplane extends Hare{
  private String[] inFlightMeal = {"Peanuts.", "Peanuts, again.", "Jet Fuel.", "Tide Pods.", "Burger King Whopper Deluxe.", "More than 3 fluid OZ of Water.", "A small family.", "A fork.", "A True TRCB-82-84 84\" Chef Base w/ (4) Drawers - 115v", "Nothing :(."};
  private double flightNumber;

  public Airplane(){super("Choppy");}

  public Airplane(double num){super("Choppy");flightNumber = num;}
 
  public void fly(){
    double r = Math.random()*10;
    if(r > 9){System.out.println("THE PLANE CRASHED! :(");}
    System.out.println("The " + getName() + " flies!");
  }
  
  public void loop(){
    double r = Math.random()*10;
    if(r > 9){System.out.println("THE PLANE CRASHED! :(");}
    System.out.println("The " + getName() + " does a super sick loop!");
  }

  public void eatMeal(){
	Random rnd = new Random();
	  
    int r = rnd.nextInt(10);
    if(r == 9){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 8){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 7){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 6){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 5){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 4){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 3){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 2){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 1){System.out.println("You got served " + inFlightMeal[r]);}
    if(r == 0){System.out.println("THE PLANE CRASHED! :");}
  }
  
  //need a run method.
  //ADDED by Ms Fritz
  public void run(double timeInSeconds) {
	  //THIS METHOD CAN CALL ALL OF YOUR INDIVIDUAL METHODS
	  //YOUR CLASS MUST OVERRIDE RUN.  IF IT DOESN'T, IT BECOMES AN
	  //ABSTRACT CLASS
	  fly();
	  loop();
	  eatMeal();
	  //have to update the distance based on the time interval received
	  double distTraveled = timeInSeconds * this.minSpeedMetersPerSecond;
	  printRunStatement(distTraveled);
	  this.distanceCoveredInMeters += timeInSeconds * this.minSpeedMetersPerSecond;	  
  }
  
  //REMOVED by L FRITZ AND ADDED TO RACER CLASS (SEE NOTE IN RACER)
  //ADDED by L FRITZ so output shows how far each racer travels in each interval
	/*
	 * private void printRunStatement(double distance) { System.out.
	 * printf("%s the airplane advances %.1f meters for a total of %.1f meters.\n",
	 * getName(), distance, this.distanceCoveredInMeters); }
	 */
  
  
}
    