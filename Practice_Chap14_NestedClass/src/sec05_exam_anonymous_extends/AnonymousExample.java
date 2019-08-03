package sec05_exam_anonymous_extends;

public class AnonymousExample {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous();
		//�͸��ڽİ�ü���� �����ǵ� wake�� ȣ��ȴ�.
		
		anony.field.wake();
		//�޼��� ȣ��� ���ÿ� ���ú����� �͸��ڽİ�ü �����Ǿ� �����ȴ�.
		
		anony.method();
		
		
		//�Ű������� �͸��ڽİ�ü�� �����ؼ� ȣ���ϰ��ִ�.
		anony.method2(new Person() {
			
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			//����Ŭ������ wake�� �������̵���.
			@Override
			public void wake() {
				System.out.println("13�ÿ� �Ͼ�ϴ�.");
				this.study();
			}
		});
	}

}
