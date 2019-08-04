package sec01_exam;

public class FieldInitValue {

	// ���������� �ϰ�, �ʵ��� �մϴ�. 
	// Ŭ������ ��� ��ü�� ���� ����� ���¸� �����ϴ� ���赵�� �����ϴ�.

	byte byteField; // 1
	short shortField; // 2
	int intField; // 4
	long longField; // 8

	boolean booleanField; // 1
	char charField; // 2(�����ڵ�) 1(�ƽ�Ű�ڵ�)

	float floatField; // 4
	double doubleField; // 8

	// ����������
	int[] arrField; // 4
	String referenceField; // 4

	// toString()�� ������ �������(�ʵ�)�� ������ ���÷� Ȯ���ϰ��� �Ҷ���,
	// �ڽ��� ���Ĵ�� ����� ���Ҷ� toString()�������̵��� �Ѵ�.

	@Override // ������̼� Annotation = �����Ϸ����� ���� �����ϴ� �κ�
	public String toString() {
		return "String";
	}
}
