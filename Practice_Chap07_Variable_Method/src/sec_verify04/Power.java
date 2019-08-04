package sec_verify04;

public class Power {

	public static long power(int x, int n) {

		long result = 0;
		int ss = 1;

		if (n == 1) {
			ss = x;
			// System.out.println("n은" + n + "일때 : " + ss);
			result = result + ss;
		} else {
			for (int i = 1; i <= n; i++) {
				ss = ss * x;
			}
			result = result + ss + power(x, n - 1); // n=1일때의 result부터 진행. 아니면 재귀메서드
		}
		return result;
	}
}
