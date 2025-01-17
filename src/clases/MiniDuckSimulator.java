package clases;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck ();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
		Duck goma = new RubberDuck ();
		goma.display();
		goma.performQuack();
		goma.performFly();
		
	}

}
