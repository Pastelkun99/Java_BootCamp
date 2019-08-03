package sec01_exam_StringBuilder;

public class StringBuilderExample {

	public static void main(String[] args) {

		//buffer(L1, L2ĳ��, ������ Ȯ��)�� �̿��ϱ� ������ ���ο� �ν��Ͻ��� �������� �ʴ´�.
		StringBuilder sb = new StringBuilder();
		//System.out.println(sb.hashCode());
		sb.append("JAVA");
		sb.append(" Program Study");
		System.out.println(sb.hashCode());		//���� ��ü�ȿ��� ���۵ǰ� ������ �˱� ���� �ؽ��ڵ� ����.
		System.out.println(sb.toString());
		
		sb.insert(3, 2);		//���� 2�� �־ �����Ͻ� ���ڿ��� �ٲ��.
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
		int length = sb.length();
		
		System.out.println("�� ���ڼ� : " + length);
		System.out.println(sb.hashCode());
		String result = sb.toString();
		System.out.println(result);
		
	}

}
