package sec02_set.exam02_UserDefineHashSet;

import java.util.Objects;

public class Member {

	// 동등 객체의 조건은 Object클래스에서도 했지만 다시 설명하면,
	// 1번째 두 객체의 해쉬코드 값이 같은지를 보고(hashcode재정의)
	// 2번째 두 객체의 필드값이 같은지를 본다.(equals 재정의)
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
			// 멤버의 이름과 나이가 다 같다며 동등객체로 인식하고 true를 리턴함.
			return member.name.equals(this.name) && member.age == this.age;
		}
		else {
			// 아니면 동등객체가 아니라고 판단하고 false를 리턴
			return false;
		}
	}
	/*@Override
	public int hashCode() {
		// 이름과 나이를 가지고 해쉬코드를 만들어 리턴함.
		return Objects.hash(this.name, this.age);
	}*/
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
