package sec01_exam_OverridingTest;

//����Ŭ����
public class HddDisk {

	int capacity;			//�뷮
	int rpm;				//�ӵ�
	
	//�⺻������
	public HddDisk() {}
	
	//�Ű������� �ִ� ������
	public HddDisk(int c, int r) {
		this.capacity = c;
		this.rpm = r;
	}
	
	public String Status() {
		return "�ϵ��ũ�� �뷮�� " + this.capacity + 
				"GB�̸�, RPM�� " + this.rpm + "�Դϴ�.";
				}
}
