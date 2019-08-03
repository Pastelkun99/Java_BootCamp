package sec_verify06;

public class AnimalExample {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		System.out.println(ani);
		
		Animal ani2 = new Animal("사자");
		System.out.println(ani2);
		
		Animal ani3 = new Animal("호랑이", 5);
		System.out.println(ani3);
	}

}
