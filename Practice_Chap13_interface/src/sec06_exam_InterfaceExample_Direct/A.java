package sec06_exam_InterfaceExample_Direct;


//������ ���迡 ���� Ŭ���� A�� B
//AŬ������ BŬ������ ����ϴ� ����

public class A {

	//Ŭ���� B�� �ϼ��� ���� �ʾƵ� ����� �� �������̽��� �ִ� �߻�޼�����
	//����θ� �˰� ������ �������� ȣ���� ����������.
	//�̰��� ������ ������ ���̴�.
	
	public void method(I i) {
		i.methodB();
	}
}
