package sec04_exam_threadname;

public class ThreadB extends Thread {

	//������
	public ThreadB() {
		this.setName("ThreadB"); 		//������ �̸� ����
	}
	
	@Override
	public void run() {
		System.out.println("���� �������� ������ �� : " + this.getName());
		for(int i = 0; i<2; i++) {
			//���⼭�� getName()�� ThreadA�� �ν��Ͻ��޼������� ����.
			System.out.println(this.getName() + " �� ����� ����");
		}
	}
}
