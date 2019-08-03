package sec05_exam_generic_polymorthism;

public class ZooBoxExample {

	public static void main(String[] args) {
		
		ZooBox<Animal> animal = new ZooBox<Animal>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird());		//에러가 납니다. 왜냐면 Zoobox는 animal이거나 그 하위타입만 올 수 있기 때문.
		//animal.add(new Object());
		
		System.out.println("Animal이거나 Animal을 상속받은 값만 출력합니다.");
		System.out.println(animal.toString());
	}
}
