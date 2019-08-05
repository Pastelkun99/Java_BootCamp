package sec_verify07;

public class Dog extends Pet {

	String name;
	int weight;

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public void move() {
		System.out.println("�������� �̸��� " + this.name + "�̰�, �����Դ� " + weight + "�Դϴ�.");
	}

}
