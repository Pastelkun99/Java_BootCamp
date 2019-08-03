package sec01_exam;

public class AcuuracyExample {

	public static void main(String[] args) {
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - (number*pieceUnit);
		
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		
		// https://www.acmicpc.net/blog/view/37
		// https://ko.wikipedia.org/wiki/%EB%B6%80%EB%8F%99%EC%86%8C%EC%88%98%EC%A0%90

	}

}
