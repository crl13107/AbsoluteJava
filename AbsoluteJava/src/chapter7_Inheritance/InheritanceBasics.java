package chapter7_Inheritance;

public class InheritanceBasics extends InheritanceMethods {
	public static void main(String[] args) {
		basics();
		superAndThis();
		enhancedTokenizer();
	}

	public void constructor() {
		super.constructor(1, 2);
	}

}

/*
 * class Vehicle { int speed = 50; }
 * 
 * class Bike3 extends Vehicle { int speed = 100;
 * 
 * void display() { System.out.println(speed); }
 * 
 * public static void main(String args[]) { Bike3 b = new Bike3(); b.display();
 * } }
 */

class Vehicle {
	public Vehicle() {
		System.out.println("Vehicle is created");
	}
}

class Bike5 extends Vehicle {
	Bike5() {
		super();// will invoke parent class constructor
		System.out.println("Bike is created");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Bike5 b = new Bike5();
	}
}