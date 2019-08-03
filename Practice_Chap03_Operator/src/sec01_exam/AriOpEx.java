package sec01_exam;

public class AriOpEx {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		System.out.println("result1 = " + result1);
		int result2 = v1 - v2;
		System.out.println("result2 = " + result2);
		int result3 = v1 * v2;
		System.out.println("result3 = " + result3);
		int result4 = v1 / v2;
		System.out.println("result4 = " + result4);
		int result5 = v1 % v2;
		System.out.println("result5 = " + result5);
		
		/*try {
			double result6 = v1 / 0; 	// 0으로 나누면?
			System.out.println("result6 =" + result6);
		} catch (Exception e2) {
			System.out.println("예외발생 : "  + e2.getMessage());
		}
		*/
		// 다음과 같은 코드는 에러가 납니다. 컴퓨터에서도, 현실에서도 0으로 나누는 것은
		// 허용되지 않습니다.
	}

}
