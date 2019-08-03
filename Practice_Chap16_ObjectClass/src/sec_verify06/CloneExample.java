package sec_verify06;

public class CloneExample {

	public static void main(String[] args) {

		Student original = new Student("perpear", "안경잡이");
		
		System.out.println("Student1 : " + original.toString());
		System.out.println("Student 인스턴스2를 Student1으로 얕은 복제를 함.");
		Student cloned = original.getStudent();
		System.out.println("Student2 : " + cloned.toString());
	}

}
