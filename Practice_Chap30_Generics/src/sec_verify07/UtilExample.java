package sec_verify07;

public class UtilExample {

	public static void main(String[] args) {
		
		Pair<String, Integer> pair1 = new Pair<String, Integer>("ȫ�浿", 35);
		System.out.println(Util.getvalue(pair1, "ȫ�浿"));
		
		ChildPair<String, String> pair2 = new ChildPair<String, String>("ȫ���", null);
		System.out.println(Util.getvalue(pair2, "ȫ���"));
		
		OtherPair<String, String> pair3 = new OtherPair<String, String>("zm1", "zm2");
		// System.out.println(Util.getvalue(pair3, "zm1"));
		// ����Ŭ������ Pair�� �ڼ��� �ƴ� OtherPair�� �� ���� ����.
		
	}
}
