package sec01_exam;

public class VarEx2 {

	public static void main(String[] args) {

		int x = 10;
		int y = x + 10;
		int temp = 0; // 임시변수

		System.out.println("x: " + x + "  y: " + y + "  tmp: " + temp);
		// 값 바꾸기
		
		// x=y;
		// y=x;
		// 이 식을 통해 x와 y의 값을 서로 바꿀 수 있을까요?
		
		temp = x;
		x = y;
		y = temp;

		System.out.println("x: " + x + "  y: " + y + "  tmp: " + temp);
	}

}
