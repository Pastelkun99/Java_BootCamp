package sec01_exam_runtime_exception;

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {

	public static void main(String[] args) {

		Animal animal = new Dog();
		//down-casting(����)
		Dog dog = (Dog)animal;
		
		//ClassCastException�߻�
		Cat cat = (Cat)animal;
		
		/*Dog dog = new Dog();
		changeDog(dog);
		//changeDog(new Dog());
		
		Cat cat = new Cat();
		changeDog(cat);
		//changeDog(new Cat());
		*/		
	}
	
	/*public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog = (Dog)Animal;
			System.out.println("Dog���� ��ȯ�� �����Ͽ����ϴ�.");
		}
		else {
			System.out.println("DOG���� ��ȯ�� ��ƽ��ϴ�.");
		}
	}*/

}
