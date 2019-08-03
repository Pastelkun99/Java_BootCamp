package sec_verify.exam05;

import java.util.ArrayList;

public class Score {

	ArrayList<Student> record = new ArrayList<>();
	
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;
	
	public void add(String stuname, String stuno, int kor, int math, int eng) {
		record.add(new Student(stuname, stuno, kor, math, eng));
	}
	
	public int getSubjectTotal() {
		for(int i = 0; i<record.size(); i++) {
			koreanTotal += record.get(i).koreanScore;
			mathTotal += record.get(i).mathScore;
			englishTotal += record.get(i).englishScore;
		}
		return koreanTotal + mathTotal + englishTotal;
	}
	
	public void displayList() {
		System.out.println("이름\t번호\t국어\t수학\t영어\t총점");
		System.out.println("================================================");
		for(int i = 0; i<record.size(); i++) {
			System.out.println(record.get(i).toString());
		}
		System.out.println("================================================");
		int total = getSubjectTotal();
		System.out.println(record.size() + "명 총점 : \t" + koreanTotal + "\t" + mathTotal + "\t" + englishTotal + "\t" + total);
	}

}
