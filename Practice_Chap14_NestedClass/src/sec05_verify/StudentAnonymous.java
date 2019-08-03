package sec05_verify;

public class StudentAnonymous {

	Student field = new Student("������") {
		
		public void goSchool() {
			System.out.println(this.name + "�� ��մϴ�.");
			System.out.println("==========================================");
		}
		
		@Override
		public void wake() {
			System.out.println("==========================================");
			System.out.println("�ʵ�(�������)�� �ʱⰪ���� ������ �ڽİ�ü");
			System.out.println(this.name + "�� 6�ÿ� �Ͼ�ϴ�.");
			this.goSchool();
		}
		
	};
	
	public void method1() {
		
		Student localVar = new Student("���ѱ�") {
			public void goMoving() {
				System.out.println(this.name + "�� ��ȭ�� �������ϴ�.");
				System.out.println("==========================================");
			}
			
			@Override
			public void wake() {
				System.out.println("==========================================");
				System.out.println("���ú����� �ʱⰪ���� ������ �ڽİ�ü");
				System.out.println(this.name + "�� 9�ÿ� �Ͼ�ϴ�.");
				this.goMoving();
			}
		};
		localVar.wake();
	}

	public void method2(Student stu) {
		stu.wake();
	}
}
