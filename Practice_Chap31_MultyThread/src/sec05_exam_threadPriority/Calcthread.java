package sec05_exam_threadPriority;

public class Calcthread extends Thread{

	int sum;
	
	public Calcthread(String name) {
		this.setName(name);  		//�̸�����(Thread + i)
	} 
	
	@Override
	public void run() {
		//2õ���� ����
		for(int i = 0; i<20000000; i++) {
			sum += i;
		}
		
		System.out.println("�۾��� ��ģ ������ : " + this.getName() + ", �հ� : " + this.sum);
	}
}
