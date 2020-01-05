package oop.ch06.question.q1;

public abstract class Car {

	abstract void start();
	abstract void drive();
	abstract void stop();
	abstract void turnoff();
	
	final public void run() {
		
		start();
		drive();
		stop();
		turnoff();
		
	}
	
}
