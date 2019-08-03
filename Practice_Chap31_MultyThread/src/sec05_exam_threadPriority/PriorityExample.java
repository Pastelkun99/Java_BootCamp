package sec05_exam_threadPriority;

public class PriorityExample {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			Thread thread = new Calcthread("Thread : " + i);
			
			//1~9������ ������
			if(i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
				//thread.setPriority(1);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
				//thread.setPriority(10);
			}
			thread.start();
		}
	}
	
	// �ƹ��� �켱������ 10���� �־��� �ϳ�, ��ġ�� �󵵰� ���� ������ �� ���� �۾��� �����ٰ� ������ �� �ִ� ���� �ƴϴ�.
	// ������ �ڹٴ� ��ȯ �Ҵ� ��� (Round-robin)������� �����ϹǷ�, CPU�� ���¿� ���� �޶�����.
}
