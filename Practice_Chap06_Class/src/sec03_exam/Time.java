package sec03_exam;

public class Time {

	/* ���� ������(Access Modifier)�� ����
	 	1. private : ���� Ŭ���� �������� ���� ����
		2. protected : ���� ��Ű��, �ٸ� ��Ű�� �ڼ� Ŭ���������� ���� ����
		3. default : ���� ��Ű��, �ٸ� ��Ű�� ���� ����
		4. public : � Ŭ������ �� ���� ����
	 */
	
	
	//��� ����(���������� private �ܺηκ��� ���� ����)
	private int hour;
	private int minute;
	private float second;
	
	//getter �޼��� : ��� ������ ���� �������� �ϴ� �޼���
	public int getHour() {
		//this�� ��ü �ڽ��� �ּҸ� ���ϰ� �ִ� �� ���������� ����
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public float getSecond() {
		return this.second;
	}
	
	//setter �޼��� : ��������� ���� �����ϴ� �޼���
	public void setHour(int h) {
		if(h <0 || h > 23) {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�!");
			return;
		}
		this.hour =h;
	}
	public void setMinute(int m) {
		if(m<0 || m> 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�!");
			return;
		}
		this.minute = m;
	}
	public void setSecond(int s) {
		if(s<0 || s> 59) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�!");
			return;
		}
		this.second = s;
		}
	//objectŬ������ toString�޼��� ������(�������̵�)��.
	//this�� ���� �ڱ� �ڽ��� Ŭ������ �ǹ���.
	@Override
	public String toString() {
		String str = this.getHour() + " : " + this.getMinute() + " : " + this.getSecond() + " ���Դϴ�.";
		return str;
	}
}
