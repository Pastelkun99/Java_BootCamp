package sec02_exam_final;

public class Person {

	final String nation = "Korea";
	final String ssn;
	String name;

	// final �ʱ�ȭ ���
	// 1. ����� ���ÿ� �ʱ�ȭ ����
	// 2. �����ڿ��� �� �ѹ� �ʱ�ȭ ���� 

	// �Ű������� �ִ� ������
	public Person(String ssn, String name) { // this�� ��ü�� �����ؾ߸� ����� �����ϴ�.
		// this�� ��ü �ڱ� �ڽ��� �ּ�(���������� ����)
		// Person p = new Person(�������� �ڸ���)
		this.ssn = ssn;
		this.name = name;
	}

}
