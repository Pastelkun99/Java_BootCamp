package sec_verify07;

public class UtilExample {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair1 = new Pair<String, Integer>("홍길동", 35);
		System.out.println(Util.getvalue(pair1, "홍길동"));
		
		ChildPair<String, String> pair2 = new ChildPair<String, String>("홍삼원", null);
		System.out.println(Util.getvalue(pair2, "홍삼순"));
		
		OtherPair<String, String> pair3 = new OtherPair<String, String>("zm1", "zm2");
		// System.out.println(Util.getvalue(pair3, "zm1"));
		// 조상클래스인 Pair의 자손이 아닌 OtherPair는 들어갈 수가 없다.
		
	}
}
