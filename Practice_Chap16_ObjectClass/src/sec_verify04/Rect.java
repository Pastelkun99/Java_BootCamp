package sec_verify04;

public class Rect {

	private int width;
	private int height;
	
	public Rect (int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	
	public boolean equals(Rect r) {
		if(r instanceof Rect) {
			Rect compareRect = (Rect)r;
			if(this.width*this.height == compareRect.width*compareRect.height) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "x : " + width + "이며, y : " + height + "이다.";
	}
}
