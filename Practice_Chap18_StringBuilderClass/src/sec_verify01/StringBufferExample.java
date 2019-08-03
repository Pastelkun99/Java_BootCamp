package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("기존 스트링 버퍼 sb 출력 : " + sb.toString());
		System.out.println("스트링 버퍼 sb의 해쉬값 출력 : " + sb.hashCode());
		System.out.println("변형된 스트링 버퍼 sb 출력 : " + sb.append(" is Pencil."));
		System.out.println("변형된 스트링 버퍼 sb 출력 : " + sb.insert(7, " my"));
		
		int length = sb.length();
		
		System.out.println("문자열 길이를 설정하여 변형된 스트링 버퍼 sb 출력 : " + sb.delete(4, length));
		System.out.println("문자열 조작 후 스트링 버퍼의 해시 코드 : " + sb.hashCode());	
		System.out.println("문자열 조작 후에도 해쉬코드가 변함이 없다. 즉, 스트링 버퍼는 새로운 인스턴스를 만들지 아니한다.");
		
		
		
		
	}
}
