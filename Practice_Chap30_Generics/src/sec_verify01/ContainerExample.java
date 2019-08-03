package sec_verify01;

public class ContainerExample {

	public static void main(String[] args) {
		
		Container<String> con = new Container<String>();
		con.setT("홍길동");
		String str = con.getT();
		System.out.println("<T> 타입 파라미터에 <String>으로 객체 생성 후 저장값 : " + str);
		
		Container<Integer> con2 = new Container<Integer>();
		con2.setT(150);
		int sootja = con2.getT();
		System.out.println("<T> 타입 파라미터에 <Integer>으로 객체 생성 후 저장값 : " + sootja);
		
	}
}
