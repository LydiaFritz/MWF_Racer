package needsAttention;

import java.util.Random;

import racerFiles.Racer;

public class Car extends Racer {

	double min;

	double max;

	int c;

	Boolean fail = false;

	String name;

	double dist;

Public Car(String n, double m1, double m2, , int rate){

min = m1;

max = m2;

c = rate;

name = n;

}

	Public Car(String n, double m1, double m2) {

		min = m1;

		max = m2;

		name = n;

	}

	Public

	static void Failrate(){

Random r = new Random;

Double rc = r.nextDouble;

If(rc <= c){

Fail =true;

} }

	Public

	void Run(double timeint){

If(!fail){

Random r = new Random;

Double rate = r.nextDouble;

Double diff = max – timeint;

Diff*=rate;

Double speed = min+diff;

Dist = speed*timeint;

}

}

}