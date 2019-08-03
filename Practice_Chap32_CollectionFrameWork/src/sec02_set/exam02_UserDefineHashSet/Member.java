package sec02_set.exam02_UserDefineHashSet;

import java.util.Objects;

public class Member {

	// ���� ��ü�� ������ ObjectŬ���������� ������ �ٽ� �����ϸ�,
	// 1��° �� ��ü�� �ؽ��ڵ� ���� �������� ����(hashcode������)
	// 2��° �� ��ü�� �ʵ尪�� �������� ����.(equals ������)
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			// ����� �̸��� ���̰� �� ���ٸ� ���ü�� �ν��ϰ� true�� ������.
			return member.name.equals(this.name) && member.age == this.age;
		}
		else {
			// �ƴϸ� ���ü�� �ƴ϶�� �Ǵ��ϰ� false�� ����
			return false;
		}
	}
	/*@Override
	public int hashCode() {
		// �̸��� ���̸� ������ �ؽ��ڵ带 ����� ������.
		return Objects.hash(this.name, this.age);
	}*/
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
