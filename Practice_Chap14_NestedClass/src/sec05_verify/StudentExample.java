package sec05_verify;

public class StudentExample {

	public static void main(String[] args) {

		StudentAnonymous studan = new StudentAnonymous();
		
		
		studan.field.wake();
		
		studan.method1();
	
		studan.method2(new Student("�迬��") {
			
			public void study() {
				System.out.println(this.name + "�� �����մϴ�.");
				System.out.println("==========================================");
			}
			
			@Override
			public void wake() {
				System.out.println("==========================================");
				System.out.println("�Ű������� �Ű������� �͸��ڼհ�ü�� ����");
				System.out.println(this.name + "�� 4�ÿ� �Ͼ�ϴ�.");
				this.study();
			}
		});
	}

}
