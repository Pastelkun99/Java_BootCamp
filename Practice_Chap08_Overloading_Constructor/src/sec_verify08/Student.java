package sec_verify08;

public class Student {

	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	public Student() {
		this("√÷¿ÁøÌ", 1, 3, 73, 74, 71);
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}

	public float getAverage(int kor, int eng, int math) {
		int sum = kor + eng + math;
		float avg = (float) sum / 3;
		return avg;
	}

	@Override
	public String toString() {
		String str = "¿Ã∏ß : " + this.name + "\n" + "√—¡° : " + getTotal(kor, eng, math) + "\n" + "∆Ú±’ : "
				+ getAverage(kor, eng, math);
		return str;
	}
}
