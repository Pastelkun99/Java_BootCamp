package sec_verify06;

public class CloneExample {

	public static void main(String[] args) {

		Student original = new Student("perpear", "�Ȱ�����");
		
		System.out.println("Student1 : " + original.toString());
		System.out.println("Student �ν��Ͻ�2�� Student1���� ���� ������ ��.");
		Student cloned = original.getStudent();
		System.out.println("Student2 : " + cloned.toString());
	}

}
