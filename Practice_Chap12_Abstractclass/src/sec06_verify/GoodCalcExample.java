package sec06_verify;

public class GoodCalcExample {

	public static void main(String[] args) {

		GoodCalc g = new GoodCalc();
		System.out.println("두 정수(2, 3)의 합 : " + g.add(2, 3));
		System.out.println("두 정수(2, -13)의 빼기 : " + g.subtract(2, -13));
		System.out.println();
		System.out.println(Math.round(g.average() * 100) / 100.0);
	}

}
