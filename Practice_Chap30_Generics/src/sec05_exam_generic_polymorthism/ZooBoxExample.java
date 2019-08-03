package sec05_exam_generic_polymorthism;

public class ZooBoxExample {

	public static void main(String[] args) {
		
		ZooBox<Animal> animal = new ZooBox<Animal>();
		
		animal.add(new Lion());
		animal.add(new Tiger());
		animal.add(new Animal());
		//animal.add(new Bird());		//������ ���ϴ�. �ֳĸ� Zoobox�� animal�̰ų� �� ����Ÿ�Ը� �� �� �ֱ� ����.
		//animal.add(new Object());
		
		System.out.println("Animal�̰ų� Animal�� ��ӹ��� ���� ����մϴ�.");
		System.out.println(animal.toString());
	}
}
