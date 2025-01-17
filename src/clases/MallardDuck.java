package clases;
	
public class MallardDuck extends Duck{
		
		public MallardDuck () {
			quackBehaviour = new Quack ();
			flyBehaviour = new FlyWithWings ();
		}
		
		public void display () {
			System.out.println("Soy un pato Mallard");
		}
}