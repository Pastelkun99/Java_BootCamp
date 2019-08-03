package sec01_exam;

public class Eratostenes {

	public static void main(String[] args) {

		int num;
		int count;
		int i;
		int primenumbercount = 0;

		for (num = 2; num <= 1000; num++) {
			count = 0;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					count += 1;
				}
			}
			if (count == 0) {
				primenumbercount++;
				System.out.println(num + "는 소수");
			}
		}
		System.out.println("구한 소수의 갯수 : " + primenumbercount);
	}

	// 위의 알고리즘은 소수(Prime Number)를 찾는 알고리즘입니다.
	// 에라토스테네스의 체 라고 불리며, 유명한 컴퓨터 프로그래밍 알고리즘 예제입니다.
}
