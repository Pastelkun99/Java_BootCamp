package sec01_Exam_SectionTV;


//����Ŭ���� (�θ�, SuperŬ����) ������� 5��;
//super() �� ����Ŭ������ ������ ȣ��.

public class Tv {

	boolean power;
	int channel;
	
	public Tv() {
		System.out.println("���� Ŭ���� ������ ȣ��");
	}
	
	// ��������(on/off)
	public void power() {
		this.power = !power;
	}
	
	//ä�� ��/�ٿ� ���
	public void channelUp() {
		++this.channel;
	}
	
	public void channelDown() {
		--this.channel;
	}
	
}
