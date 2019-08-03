package sec_verify.exam05;

public class Student {

	final static int 	LEFT = 0;
	final static int 	CENTER = 1;
	final static int 	RIGHT = 2;
	String 				name = "";
	String 				studentNo = "";
	int 				koreanScore = 0;
	int 				mathScore = 0;
	int 				englishScore =0;
	
	public Student(String name, String studentNo, int koreanScore, int mathScore, int englishScore) {
		this.name = name;
		this.studentNo = studentNo;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.englishScore = englishScore;
	}
	
	public int getTotal() {
		return this.koreanScore + this.englishScore + this.mathScore;
	}
	
	public static String format(String str, int length, int alignment) {
		return "";
	}
	
	@Override
	public String toString() {
		return this.name + "\t" + this.studentNo + "\t" + this.koreanScore + "\t" + this.mathScore + 
				"\t" + this.englishScore + "\t" + getTotal();
	}
	
}
