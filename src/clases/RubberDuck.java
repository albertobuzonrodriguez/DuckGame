package clases;

public class RubberDuck extends Duck {
	
	public RubberDuck () {
		quackBehaviour = new Squeak ();
		flyBehaviour = new FlyNoWings ();
	}
	
	public void display () {
		System.out.println("Soy un pato de goma");
	}
}