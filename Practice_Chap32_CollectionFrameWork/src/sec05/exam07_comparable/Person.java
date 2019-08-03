package sec05.exam07_comparable;

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// Comparable<>�� ������ �ִ� �߻�޼��带 �����Ǹ� �ؾ߸�,
	// treeset�� ������������ ������ �ȴ�.
	// �Ʒ��� ���� �ݴ�� �ϸ� ���������� �ȴ�.
	
	// ���̷� ����
	/*@Override
	public int compareTo(Person o) {
		if(this.age < o.age) {
			return -1;
		}
		else if(this.age == o.age) {
			return 0;
		}
		else
			return 1;
	}*/
	
	// �̸����� ����
	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.name) < 1) {
			return -1;
		}
		else if(this.name.equals(o.name)) {
			return 0;
		}
		else
			return 1;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + this.name + " ���� : " + this.age;
	}
	
	
	
}
