package sec_verify01;

public class ContainerExample {

	public static void main(String[] args) {
		
		Container<String> con = new Container<String>();
		con.setT("ȫ�浿");
		String str = con.getT();
		System.out.println("<T> Ÿ�� �Ķ���Ϳ� <String>���� ��ü ���� �� ���尪 : " + str);
		
		Container<Integer> con2 = new Container<Integer>();
		con2.setT(150);
		int sootja = con2.getT();
		System.out.println("<T> Ÿ�� �Ķ���Ϳ� <Integer>���� ��ü ���� �� ���尪 : " + sootja);
		
	}
}
