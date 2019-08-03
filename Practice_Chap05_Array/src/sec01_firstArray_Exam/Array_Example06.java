package sec01_firstArray_Exam;

public class Array_Example06 {

	public static void main(String[] args) {

		char[] abc = new char[] { 'A', 'B', 'C', 'D' };
		char[] num = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		System.out.println(abc); // char[]은 배열 안의 값을 그대로 출력합니다.
		System.out.println(num);

		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만들고자 한다면?
		char[] result = new char[abc.length + num.length];

		// System.arraycopy의 매개변수 (Java.lang.System 클래스 API참조)
		// Object src : 원본 배열
		// int srcPos : 원본 배열의 복사를 시작할 인덱스
		// Object dest : 타겟 배열
		// int destPos : 타겟 배열의 붙여넣기를 시작할 인덱스
		// int length : 복사할 길이
		// System.arraycopy(abc, 0, result, 0, abc.length);
		// 를 사용합니다. 자주 쓰이지는 않습니다.
		
		System.arraycopy(num, 0, result, abc.length, num.length);

		System.out.println(result);

		// 배열 abc를 배열 num의 첫번 째 위치로부터 배열 abc길이만큼 복사합니다.
		System.arraycopy(abc, 0, num, 0, abc.length);
		// System.out.println(num.toString());

		// number의 인덱스 6 위치에 3개를 복사합니다.
		System.arraycopy(abc, 0, num, 6, 3);
		// System.out.println(num);

	}

}
