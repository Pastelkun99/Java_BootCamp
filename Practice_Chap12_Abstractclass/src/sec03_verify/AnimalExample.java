package sec03_verify;

public class AnimalExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Cat c = new Cat();
		Tree_Sparrow t = new Tree_Sparrow();
		
		System.out.println("--------------------------");
		c.breathe();
		c.sound();
		System.out.println("--------------------------");
		d.breathe();
		d.sound();
		System.out.println("--------------------------");
		t.breathe();
		t.sound();
		System.out.println("--------------------------");

	}

}
