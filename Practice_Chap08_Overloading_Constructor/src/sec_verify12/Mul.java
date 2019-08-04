package sec_verify12;

public class Mul {

	private int firstnum;
	private int secondnum;

	public Mul() {
	}

	public void setValue(int firstnum, int secondnum) {
		this.firstnum = firstnum;
		this.secondnum = secondnum;
	}

	public int calculate() {
		int result = 0;
		result = this.firstnum * this.secondnum;
		return result;
	}
}
