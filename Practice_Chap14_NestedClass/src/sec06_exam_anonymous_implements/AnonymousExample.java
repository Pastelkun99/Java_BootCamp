package sec06_exam_anonymous_implements;

public class AnonymousExample {

	public static void main(String[] args) {

		//Anonymous�� �ν��Ͻ� ����
		Anonymous anony = new Anonymous();
		
		//anony�ν��Ͻ��� �ִ� �͸�����ü�� �������̵��� �޼��� ȣ��
		anony.field.turnOn();
		anony.field.turnOff();
		anony.method1();
		
		//�Ű������� �������̽� Ÿ���� ���ͼ� �ٷ� �͸�����ü�� �����Ͽ� ����.
		anony.method2(new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("����Ʈ TV�� �մϴ�.");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("����Ʈ TV�� ���ϴ�.");				
			}
		});
	}

}
