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
		System.out.println("강아지의 이름은 " + this.name + "이고, 몸무게는 " + weight + "입니다.");
	}

}
