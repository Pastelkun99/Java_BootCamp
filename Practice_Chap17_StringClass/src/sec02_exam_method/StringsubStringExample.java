package sec02_exam_method;

public class StringsubStringExample {

	public static void main(String[] args) {
		
		//문자열 잘라내기 (잘라서 들고 오는 것에 가까운 듯)
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
	}
}
