package sec01_exam_overloading;

public class Overloading {
	
	// 메소드의 이름은 같으나, 매개변수의 타입, 갯수를 다르게 하여 각기
	// 다른 기능을 수행하게 하는 것이 오버로딩입니다.
	
	// 오버로딩은 설계하는 방법에 따라 전혀 다른 로직을 갖게 할 수도 있으나,
	// 기본적으로 하나의 공통된 기능을 수행하는 메소드를 입력값에 따라 다르게 세분화하는
	// 용도로 사용합니다.
	
	// 만일 덧셈을 수행하는 아래의 add메소드에서, double 값을 두개 입력 받았다고해서
	// 뺄셈을 처리하도록 설계한다면, 이는 유지 보수가 힘들어질 뿐만 아니라
	// 이를 개발한 프로그래머에게 혼동을 줄 수 있습니다.

	public int add(int a, int b) {
		System.out.print("int add(int a, int b) = ");
		return a + b;
	}

	public long add(long a, int b) {
		System.out.print("long add(int a, long b) = ");
		return a + b;
	}

	public long add(int a, long b) {
		System.out.print("long add(int a, long b) = ");
		return a + b;
	}

	public long add(long a, long b) {
		System.out.print("long add(long a, long b) = ");
		return a + b;
	}

	public int add(int[] a) {
		// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) = ");
		int result = 0;
		for (int i = 0; i < a.length; i++)
			result += a[i];
		return result;
	}
}
