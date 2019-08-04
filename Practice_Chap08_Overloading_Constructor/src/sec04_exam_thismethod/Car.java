package sec04_exam_thismethod;

public class Car {

	String color; // ����
	String gearType; // ���ӱ� ���� - auto(�ڵ�), manual(����)
	int door; // ���� ����

	// ������
	// �����ڰ� �������� ���� ���� �׻� �����ε��� ��Ģ�� ����� �ϴ� �Ϳ� ����.

	public Car() {
		this("white", "auto", 4);
	}

	public Car(String color) {
		this(color, "auto", 4); // color���� ������ �Ű����� 3���� ������ ȣ��
	}

	public Car(String color, String gearType) {
		this(color, gearType, 4);
	}

	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString() {
		String str = "color = " + this.color + ", gearType = " + this.gearType + ", door = " + this.door;
		return str;
	}
}
