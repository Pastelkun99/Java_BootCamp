package sec02_exam_starCraftUnit;

public class Marine extends Unit {
	
	String str;
	
	//������
	public Marine() {}
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("������ ��ġ : " + this.x + ", " + this.y + "�� �̵���.");
	}
	
	public void stimPack() {
		this.str = "���ݸ�� : ������ ����";
		System.out.println(this.str);
	}

}