package sec03_exam_singleinheritance;


//����Ŭ���� (�θ�, SuperŬ����) ������� 5��;

public class Tv {

	boolean power;
	int channel = 10;
	
	//�⺻������	
	public Tv() {
		super(); //Object ������ ȣ��
		System.out.println("Tv���� Ŭ���� ������ ȣ��");
	}
	
	// ��������(on/off)
	public void power() {
		this.power = !this.power;
		System.out.println("����Ŭ���� Tv�� power�޼��带 ȣ���Ͽ����ϴ�.");
	}
	
	//ä�� ��/�ٿ� ���
	public void channelUp() {
		++this.channel;
		System.out.println("����Ŭ���� Tv�� channelUp�޼��带 ȣ���Ͽ����ϴ�.");
	}
	
	public void channelDown() {
		--this.channel;
		System.out.println("����Ŭ���� Tv�� channelDown�޼��带 ȣ���Ͽ����ϴ�.");
	}
	
}
