package sec_verify03;

public class ColorPoint extends Point {

	String color;
	
	public void setColor(String color) {
		this.color = color;
		if(color.equals("레드")) 
			super.set(3, 4);
		else if (color.equals("블루"))  
			super.set(10, 50);
		else if (color.equals("노랑")) 
			super.set(20, 17);
		else if (color.equals("그린")) 
			super.set(2, 1);
	
		System.out.print("색상이 " + color + "인 점의 좌표 : (");
		super.showPoint();	
	}
	
	public void showColorPoint() {
		System.out.println("색상이 " + color + "인 점의 좌표 : ");
	}
	
	public ColorPoint() {
		
	}
}
