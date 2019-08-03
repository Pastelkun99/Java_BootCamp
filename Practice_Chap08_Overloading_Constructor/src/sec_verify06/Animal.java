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
		return "이 동물의 이름은 " + name + "이며, 나이는 " + age + "입니다.";
	}
	
}
