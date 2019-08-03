package sec07_exam_synchronized.copy;

public class Calculator {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	// ����ȭ �޼���, Ȯ���� ������ü�� �����ϱ� ���ؼ� user1�� ���� �����ϰ� ��������,
	// user2�� �����ϹǷ� �ӵ��� ��������. ������ �������� �ŷڼ��� ����ȴ�.
	// ���� exam06���� synchronized�� ���� �� �ۿ� ����.
	public synchronized void setMemory(int memory) {
		
		this.memory = memory;	//�ʱ�ȭ
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		
		//���� �������� ������ �̸��� memory�� ���
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
