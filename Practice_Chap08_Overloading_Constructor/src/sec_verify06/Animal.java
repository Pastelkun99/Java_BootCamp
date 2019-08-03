package sec_verify06;

public class Animal {
	
	String name;
	int age;
	
	public Animal() {
		this(null, 0);
	}
	
	public Animal(String name) {
		this(name, 0);
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int print() {
		return age;
	}
	
	public String print(String name, int age) {
		return name;
	}

	@Override
	public String toString() {
		return "�� ������ �̸��� " + name + "�̸�, ���̴� " + age + "�Դϴ�.";
	}
	
}
