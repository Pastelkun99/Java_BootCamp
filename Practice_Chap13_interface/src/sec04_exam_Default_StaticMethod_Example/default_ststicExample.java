package sec04_exam_Default_StaticMethod_Example;

public class default_ststicExample {

	public static void main(String[] args) {

		Child c = new Child();
		//�ν��Ͻ��� �����ؾ� ȣ�� ������ default�޼��� ����,
		//������ �̸��̶�� �������̵��� �ؾ��Ѵ�.
		
		c.childmethod();
		c.parentmethod2();
		c.method1();
		c.method2();
		c.method3();
		c.method4();
		
		//�ٷ� ���� ������ static�޼���
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
	}

}
