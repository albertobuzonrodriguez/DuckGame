package clases;


public abstract class Duck{
	
	 protected FlyBehaviour flyBehaviour;
	 protected QuackBehaviour quackBehaviour;
	 
	 public Duck() {}
	 
	 public abstract void display();
	 
	 public void performFly() {
		 flyBehaviour.fly();
	 }
	 
	 public void performQuack() {
		 quackBehaviour.quack();
	 } 
	 
	 
}
