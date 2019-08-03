package sec05_exam_anonymous_extends;

public class Anonymous {
	//personŬ������ ����ؼ� �͸��ڽİ�ü�� �ʵ��� �ʱⰪ���� ����ϰ� �ִ�.
	Person field = new Person() {
		//�͸��ڽİ�ü�� ��������� ����޼���� ���ο����� ����ϰ�
		//�ƿ﷯ ���뵵�� ��κ� ����Ŭ������ �޼��带 �������̵��� �� 
		//Ȱ������ ��������
		
		void work() {
			System.out.println("����մϴ�.");
		}
		
		//����Ŭ������ wake�� �������̵� �ϰ� �ִ�.
		@Override
		public void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			this.work(); //�ڼ�Ŭ������ ����޼��� ȣ��
		}
		
	};
	
	void method() {
		//���ú����� �����ؼ� �͸� �ڽİ�ü�� �����Ͽ� ����Ŭ�������� method�� ȣ���Ѵ�.
		
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å�մϴ�");	
			}
			//����Ŭ������ wake�� �������̵��ϰ��ִ�.
			@Override
			public void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				this.walk();
			}
		};
		localVar.wake();		//����Ŭ������ �޼��带 ȣ���� ��������� ����� ��.
	}
	
	//�Ű������� ����Ŭ���� Ÿ���� ������ ���Դ�. �� �ǹ̴�? -> person�� �ڼհ�ü �Ǵ� �ڱ��ڽŵ� �� �� ����.
	void method2(Person person) {
		person.wake();
	}
}
