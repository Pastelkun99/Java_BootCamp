package sec02_exam_starCraftUnit;

public class DropShip extends Unit {
	
	String str;
	
	//������
	public DropShip() {}
	
	@Override
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("������� ��ġ : " + this.x + ", " + this.y + "�� �̵���.");
	}
	
	public void load() {
		this.str = "ž�� ��� : ���� ž��!";
		System.out.println(this.str);
	}
	
	public void unload() {
		this.str = "ž�� ��� : ���� �ϰ�!";
		System.out.println(this.str);
	}

}
