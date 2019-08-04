package sec_verify12;

public class Div {

	private int firstnum;
	private int secondnum;

	public Div() {
	}

	public void setValue(int firstnum, int secondnum) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}

	public int calculate() {
		int result = 0;
		result = this.firstnum / this.secondnum;
		return result;
	}
}
