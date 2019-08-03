package sec_verify03;

public class ColorPoint extends Point {

	String color;
	
	public void setColor(String color) {
		this.color = color;
		if(color.equals("����")) 
			super.set(3, 4);
		else if (color.equals("���"))  
			super.set(10, 50);
		else if (color.equals("���")) 
			super.set(20, 17);
		else if (color.equals("�׸�")) 
			super.set(2, 1);
	
		System.out.print("������ " + color + "�� ���� ��ǥ : (");
		super.showPoint();	
	}
	
	public void showColorPoint() {
		System.out.println("������ " + color + "�� ���� ��ǥ : ");
	}
	
	public ColorPoint() {
		
	}
}
