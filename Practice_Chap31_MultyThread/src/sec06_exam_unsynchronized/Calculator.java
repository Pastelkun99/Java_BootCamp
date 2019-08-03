package sec06_exam_unsynchronized;

public class Calculator {

	private int memory;

	public int getMemory() {
		return this.memory;
	}

	public void setMemory(int memory) {
		
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
