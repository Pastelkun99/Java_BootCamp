package sec03_exam_Contsructor;

public class Car {
	
	String color;			//����
	String gearType;		//���ӱ� ���� - auto(�ڵ�), manual(����)
	int door;				//���� ����
	
	//������
	//�ƹ��� �����ڰ� ����Ǿ����� �ʴٸ�, �����Ϸ��� �⺻�����ڸ� ��.
	
	public Car() {
		this("white", "auto", 4);
		System.out.println("�⺻������ ȣ��");
	}
	//�Ű������� �ִ� ������
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�Ű������� �ִ� ������ ȣ��");
	}
	
	//������̼� = annotation : �����Ϸ����� ���ϰ� üũ�� �϶�� ��/
	//���� �����Ǹ� ������ �´��� ���޶�� ��
	@Override
	public String toString() {
		String str = "����=" + this.color + ", ���Ÿ��=" + this.gearType+ " �� ���� = " + this.door;
		return str;
		}
	}

